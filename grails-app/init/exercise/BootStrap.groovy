package exercise

class BootStrap {

    def init = { servletContext ->
        Person andi = new Person(name: "Andi").save(failOnError: true)
        Person sara = new Person(name: "Sara").save(failOnError: true)
        Person joelle = new Person(name: "Joëlle").save(failOnError: true)
        Person tabita = new Person(name: "Tabita").save(failOnError: true)
        Person mael = new Person(name: "Mael").save(failOnError: true)

        Event andiBday = new Event(
            date: Date.parse("dd.MM.yyyy", "02.09.2018"),
            description: "Andi's Geburtstag",
            person: andi
        ).save(failOnError: true)
        Event saraBday = new Event(
            date: Date.parse("dd.MM.yyyy", "19.04.2019"),
            description: "Sara's Geburtstag",
            person: sara
        ).save(failOnError: true)
        Event joelleBday = new Event(
            date: Date.parse("dd.MM.yyyy", "18.01.2019"),
            description: "Joëlle's Geburtstag",
            person: joelle
        ).save(failOnError: true)
        Event tabitaBday = new Event(
            date: Date.parse("dd.MM.yyyy", "10.12.2018"),
            description: "Tabita's Geburtstag",
            person: tabita
        ).save(failOnError: true)
        Event maelBday = new Event(
            date: Date.parse("dd.MM.yyyy", "15.01.2019"),
            description: "Maels's Geburtstag",
            person: mael
        ).save(failOnError: true)

        Event event1 = new Event(
            date: Date.parse("dd.MM.yyyy", "01.06.2018"),
            description: "Event 1",
            person: sara
        ).save(failOnError: true)
        Event event2 = new Event(
            date: Date.parse("dd.MM.yyyy", "03.06.2018"),
            description: "Event 2",
            person: mael
        ).save(failOnError: true)
        Event event3 = new Event(
            date: Date.parse("dd.MM.yyyy", "04.06.2018"),
            description: "Event 3",
            person: joelle
        ).save(failOnError: true)
        Event event4 = new Event(
            date: Date.parse("dd.MM.yyyy", "06.06.2018"),
            description: "Event 4",
            person: tabita
        ).save(failOnError: true)
        Event event5 = new Event(
            date: Date.parse("dd.MM.yyyy", "08.06.2018"),
            description: "Event 5",
            person: joelle
        ).save(failOnError: true)
        Event event6 = new Event(
            date: Date.parse("dd.MM.yyyy", "09.06.2018"),
            description: "Event 6",
            person: sara
        ).save(failOnError: true)
        Event event7 = new Event(
            date: Date.parse("dd.MM.yyyy", "12.06.2018"),
            description: "Event 7",
            person: andi
        ).save(failOnError: true)
        Event event8 = new Event(
            date: Date.parse("dd.MM.yyyy", "15.06.2018"),
            description: "Event 8",
            person: tabita
        ).save(failOnError: true)
        Event event9 = new Event(
            date: Date.parse("dd.MM.yyyy", "18.06.2018"),
            description: "Event 9",
            person: andi
        ).save(failOnError: true)
        Event event10 = new Event(
            date: Date.parse("dd.MM.yyyy", "20.06.2018"),
            description: "Event 10",
            person: tabita
        ).save(failOnError: true)

    }
    def destroy = {
    }
}
