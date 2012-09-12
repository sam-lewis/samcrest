package bling.assertion

class FloatAssertTest extends NumberAssertTest {

    @Override
    def getNumber(int i) {
        return new Float(i)
    }
}
