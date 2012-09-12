package bling.assertion

class IntegerAssertTest extends NumberAssertTest {

    @Override
    def getNumber(int i) {
        return new Integer(i)
    }
}
