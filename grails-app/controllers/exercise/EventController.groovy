package exercise

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class EventController {

    def list() {
        def events
        def person = params.person

        if (person != null) {
            person = Person.findAllByName(person)
            events = Event.findAllByPerson(person)
        } else {
            events = Event.listOrderByDate(order: "asc")
        }

        def persons = Person.list()

        render view: 'list',
            model:[
                events: events,
                persons: persons
            ]
    }

}
