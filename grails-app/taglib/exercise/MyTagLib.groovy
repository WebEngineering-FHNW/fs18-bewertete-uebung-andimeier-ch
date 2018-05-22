package exercise

class MyTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = 'exercise'

    def navbar = { attrs, body ->
        out << '<nav class="navbar is-primary"><div class="navbar-menu">'
        out << body()
        out << '</div></nav>'
    }

    def listUrl = { attrs, body ->
        if (attrs.person) {
            out << "?person=${attrs.person}&event=${attrs.event}"
        } else {
            out << "?event=${attrs.event}"
        }
    }
}
