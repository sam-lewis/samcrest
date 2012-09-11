package bling.assertion

import spock.lang.Specification

import static bling.assertion.Assert.assertThat

class ObjectAssertTest extends Specification {

    def "check isNotNull() failure"() {
        when:
        assertThat((Object) null).isNotNull()

        then:
        def e = thrown(AssertionFailure)
        e.message == "value is null"
    }

    def "check isNotNull() success"() {
        when:
        assertThat(new Object()).isNotNull()

        then:
        notThrown(Throwable)
    }

    def "check isNull() failure"() {
        when:
        assertThat(new Object()).isNull()

        then:
        def e = thrown(AssertionFailure)
        e.message == "value is not null"
    }

    def "check isNull() success"() {
        when:
        assertThat((Object) null).isNull()

        then:
        notThrown(Throwable)
    }

    def "check equals() is not supported"() {
        when:
        assertThat(new Object()).equals(new Object())

        then:
        thrown(UnsupportedOperationException)
    }

    def "check isEqualTo() failure"() {
        when:
        assertThat(object1).isEqualTo(object2)

        then:
        def e = thrown(AssertionFailure)
        e.message == "Objects are not equal"

        where:
        object1      | object2
        new Object() | new Object()
        new Object() | null
        null         | new Object()
    }

    def "check isEqualTo() success"() {
        given:
        def object = new Object()

        when:
        assertThat(object).isEqualTo(object)

        then:
        notThrown(Throwable)
    }
}
