package exercise

class Event {

    Date date
    String description
    Person person

    static constraints = {
        date        nullable: false
        description nullable: false
        person      nullable: false
    }
}
