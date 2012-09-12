package bling.assertion

import spock.lang.Specification

import static bling.assertion.Assert.assertThat

abstract class NumberAssertTest extends Specification {

    abstract def getNumber(int i)

    def "check isGreaterThan() failure"() {
        given:
        def convertedValue = getNumber(value)
        def convertedCompareTo = getNumber(compareTo)

        when:
        assertThat(convertedValue).isGreaterThan(convertedCompareTo)

        then:
        def e = thrown(AssertionFailure)
        e.message == "[$convertedValue] is not greater than [$convertedCompareTo]"

        where:
        value | compareTo
        1     | 1
        2     | 2
        2     | 3
    }

    def "check isGreaterThan() success"() {
        when:
        assertThat(getNumber(value)).isGreaterThan(getNumber(compareTo))

        then:
        noExceptionThrown()

        where:
        value | compareTo
        1     | 0
        2     | 1
        2     | 0
    }

    def "check isGreaterThanOrEqualTo() failure"() {
        given:
        def convertedValue = getNumber(value)
        def convertedCompareTo = getNumber(compareTo)

        when:
        assertThat(convertedValue).isGreaterThanOrEqualTo(convertedCompareTo)

        then:
        def e = thrown(AssertionFailure)
        e.message == "[$convertedValue] is not greater than or equal to [$convertedCompareTo]"

        where:
        value | compareTo
        1     | 2
        2     | 3
        2     | 4
    }

    def "check isGreaterThanOrEqualTo() success"() {
        when:

        assertThat(getNumber(value)).isGreaterThanOrEqualTo(getNumber(compareTo))

        then:
        noExceptionThrown()

        where:
        value | compareTo
        1     | 1
        2     | 2
        2     | 1
        2     | 0
    }

    def "check isLessThan() failure"() {
        given:
        def convertedValue = getNumber(value)
        def convertedCompareTo = getNumber(compareTo)

        when:
        assertThat(convertedValue).isLessThan(convertedCompareTo)

        then:
        def e = thrown(AssertionFailure)
        e.message == "[$convertedValue] is not less than [$convertedCompareTo]"

        where:
        value | compareTo
        1     | 1
        1     | 0
        2     | 2
        2     | 1
    }

    def "check isLessThan() success"() {
        when:

        assertThat(getNumber(value)).isLessThan(getNumber(compareTo))

        then:
        noExceptionThrown()

        where:
        value | compareTo
        1     | 2
        2     | 3
        2     | 4
    }

    def "check isLessThanOrEqualTo() failure"() {
        given:
        def convertedValue = getNumber(value)
        def convertedCompareTo = getNumber(compareTo)

        when:
        assertThat(convertedValue).isLessThanOrEqualTo(convertedCompareTo)

        then:
        def e = thrown(AssertionFailure)
        e.message == "[$convertedValue] is not less than or equal to [$convertedCompareTo]"

        where:
        value | compareTo
        1     | 0
        2     | 1
        2     | 0
    }

    def "check isLessThanOrEqualTo() success"() {
        when:

        assertThat(getNumber(value)).isLessThanOrEqualTo(getNumber(compareTo))

        then:
        noExceptionThrown()

        where:
        value | compareTo
        1     | 1
        2     | 2
        2     | 3
    }
}
