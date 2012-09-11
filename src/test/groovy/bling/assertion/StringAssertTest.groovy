package bling.assertion

import spock.lang.Specification

import static bling.assertion.Assert.assertThat

class StringAssertTest extends Specification {

    def "check isNullOrEmpty() failure"() {
        when:
        assertThat(value).isNullOrEmpty()

        then:
        def e = thrown(AssertionFailure)
        e.message == "[$value] was not null or empty"

        where:
        value << [" ", "abc"]
    }

    def "check isNullOrEmpty() success"() {
        when:
        assertThat((String) value).isNullOrEmpty()

        then:
        notThrown(Throwable)

        where:
        value << [null, ""]
    }

    def "check hasSize() failure"() {
        given:
        def expectedLength = 3

        when:
        assertThat(string).hasSize(expectedLength)

        then:
        def e = thrown(AssertionFailure)
        e.message == "[$string] is length $length, expected $expectedLength"

        where:
        string  | length
        " "     | 1
        "  "    | 2
        "    "  | 4
        "     " | 5
    }

    def "check hasSize() success"() {
        given:
        def expectedLength = 3
        def string = "123"


        when:
        assertThat(string).hasSize(expectedLength)

        then:
        notThrown(Throwable)
    }
}
