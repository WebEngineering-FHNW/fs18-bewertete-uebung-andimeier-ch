package exercise

import grails.validation.ValidationException
import groovy.time.TimeCategory
import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK

class EventController {

    EventService eventService

    def index() {
        def personId = params.person ? params.int('person') : 0
        def eventId = params.event ? params.int('event') : 0

        render view: 'index',
            model: [
                events: eventListByPerson(personId),
                persons: Person.list(),
                remainingDays: calculateRemainingDays(eventId),
                eventTitle: eventTitle(eventId),
                activeEvent: eventId,
            ]
    }

    def show(Long id) {
        respond eventService.get(id)
    }

    def create() {
        respond new Event(params)
    }

    def save(Event event) {
        if (event == null) {
            notFound()
            return
        }

        try {
            eventService.save(event)
        } catch (ValidationException e) {
            respond event.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'event.label', default: 'Person'), event.id])
                redirect event
            }
            '*' { respond event, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond eventService.get(id)
    }

    def update(Event event) {
        if (event == null) {
            notFound()
            return
        }

        try {
            eventService.save(event)
        } catch (ValidationException e) {
            respond event.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'event.label', default: 'Person'), event.id])
                redirect event
            }
            '*'{ respond event, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        eventService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'event.label', default: 'Event'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
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

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'event.label', default: 'Person'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

}
