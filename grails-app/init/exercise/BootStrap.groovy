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

    }
    def destroy = {
    }
}
