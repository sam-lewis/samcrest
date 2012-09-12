package bling.assertion

class BigDecimalAssertTest extends NumberAssertTest {

    @Override
    def getNumber(int i) {
        return new BigDecimal(i)
    }
}
