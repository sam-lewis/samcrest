package bling.assertion

class ShortAssertTest extends NumberAssertTest {

    @Override
    def getNumber(int i) {
        return Short.valueOf(i.toString())
    }
}
