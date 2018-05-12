package exercise

class Person {

    String name

    String toString() {
        "$name"
    }

    static constraints = {
        name nullable: false
    }
}
