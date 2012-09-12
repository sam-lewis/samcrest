package bling.assertion

class DoubleAssertTest extends NumberAssertTest {

    @Override
    def getNumber(int i) {
        return new Double(i)
    }
}
