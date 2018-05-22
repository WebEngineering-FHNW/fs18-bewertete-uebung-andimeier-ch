package exercise

class MyTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

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
