package bling.assertion

class LongAssertTest extends NumberAssertTest {

    @Override
    def getNumber(int i) {
        return new Long(i)
    }
}
