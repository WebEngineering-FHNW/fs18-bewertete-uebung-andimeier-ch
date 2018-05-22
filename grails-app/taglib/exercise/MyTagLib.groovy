package exercise

class MyTagLib {
    def listUrl = { attrs, body ->
        def params = ''
        if (attrs.person) {
            params = "?person=${attrs.person}&event=${attrs.event}"
        } else {
            params = "?event=${attrs.event}"
        }
        out << params
    }
}
