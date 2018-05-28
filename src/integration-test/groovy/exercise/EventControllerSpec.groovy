package exercise

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class EventControllerSpec extends GebSpec {

    void 'test home is there'() {
        when:'The home page is visited'
            go '/'
        then: 'The title is Noch wievielmal schlafen?'
            title == 'Noch wievielmal schlafen?'
    }

    void 'the correct event description is displayed in the details panel'() {
        when: 'you go to the homepage'
            go '/'
        then: 'the title is Noch wievielmal schlafen?'
            title == 'Noch wievielmal schlafen?'

        when: 'you click on the first event'
            $('a[href="/event?event=1"]').click()
        then: 'the event title in the details panel is Andis Geburtstag'
            $('.details-eventtitle').text() == 'Andi\'s Geburtstag'
    }

    void 'select person from the person filter'() {
        when: 'you go to the homepage'
        go '/'
        then: 'the title is Noch wievielmal schlafen?'
        title == 'Noch wievielmal schlafen?'

        when: 'you click on the filter button'
        $('.navbar-item.has-dropdown').click()
        then: 'the person list is shown'
        $('.dropdown-persons').isDisplayed()

        when: 'you select Andi from the person list'
        $('a[href="/event?person=1"]').click()
        then: 'the second list-item is Andis Geburtstag'
        $('.list-item:first-child .list-heading').text() == 'Andi\'s Geburtstag'
    }

    void 'plus icon links to create page and back icon links to homepage'() {
        when: 'you go to the homepage'
            go '/'
        then: 'the title is Noch wievielmal schlafen?'
            title == 'Noch wievielmal schlafen?'

        when: 'you click on the plus icon'
            $('a[href="/event/create"]').click()
        then: 'you land on the create page'
            title == 'Ereignis hinzufügen'

        when: 'you click on the back icon'
            $('.navbar-item[href="/event"]').click()
        then: 'you go back to the homepage'
            title == 'Noch wievielmal schlafen?'
    }
}