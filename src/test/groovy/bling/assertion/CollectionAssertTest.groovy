package bling.assertion

import spock.lang.Specification

import static bling.assertion.Assert.assertThat

class CollectionAssertTest extends Specification {

    def "check isEmpty() null failure"() {
        when:
        assertThat((Collection) null).isEmpty()

        then:
        def e = thrown(AssertionFailure)
        e.message == "value is null"
    }

    def "check isEmpty() failure"() {
        given:
        def collection = [""]
        when:
        assertThat(collection).isEmpty()

        then:
        def e = thrown(AssertionFailure)
        e.message == "Collection is not empty, actual size 1"
    }

    def "check isEmpty() success"() {
        given:
        def collection = []
        when:
        assertThat(collection).isEmpty()

        then:
        notThrown()
    }
}
