package exercise

import groovy.time.TimeCategory

class EventController {

    def list() {
        def personId = params.person ? params.int('person') : 0
        def eventId = params.event ? params.int('event') : 0

        render view: 'list',
            model:[
                events: eventListByPerson(personId),
                persons: Person.list(),
                remainingDays: calculateRemainingDays(eventId),
                eventTitle: eventTitle(eventId),
                activeEvent: eventId,
            ]
    }

    private def eventListByPerson(int personId) {
        if (personId != 0) {
            def person = Person.load(personId)
            return Event.findAllByPerson(person)
        } else {
            return Event.listOrderByDate(order: "asc")
        }

    }

    private def calculateRemainingDays(int eventId) {
        if (eventId == 0) return '...'
        def event = Event.load(eventId)
        def today = new Date()
        def eventDate = event.date
        def remaining = daysBetween(today, eventDate)

        return remaining
    }

    // https://stackoverflow.com/questions/5116936/how-to-find-the-number-of-days-between-two-dates-in-java-or-groovy
    def daysBetween(def startDate, def endDate) {
        use(TimeCategory) {
            def duration = endDate - startDate
            return duration.days
        }
    }

    private String eventTitle(int eventId) {
        if (eventId == 0) return '...'
        def event = Event.load(eventId)
        return event.description
    }

}
