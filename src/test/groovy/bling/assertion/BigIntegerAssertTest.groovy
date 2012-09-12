package bling.assertion

class BigIntegerAssertTest extends NumberAssertTest {

    @Override
    def getNumber(int i) {
        return new BigInteger(i)
    }
}
