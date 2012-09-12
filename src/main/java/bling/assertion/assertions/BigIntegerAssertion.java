package bling.assertion.assertions;

import java.math.BigInteger;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class BigIntegerAssertion extends Assertion<BigIntegerAssertion, BigInteger> implements NumberAssertion<BigIntegerAssertion, BigInteger> {

    public BigIntegerAssertion(BigInteger value) {
        super(value);
    }

    @Override
    public BigIntegerAssertion isGreaterThan(BigInteger number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) == 1, "[%s] is not greater than [%s]", value(), number);
        return me();
    }

    @Override
    public BigIntegerAssertion isGreaterThanOrEqualTo(BigInteger number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) >= 0, "[%s] is not greater than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public BigIntegerAssertion isLessThan(BigInteger number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) == -1, "[%s] is not less than [%s]", value(), number);
        return me();
    }

    @Override
    public BigIntegerAssertion isLessThanOrEqualTo(BigInteger number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) <= 0, "[%s] is not less than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public BigIntegerAssertion isPositive() {
        return isGreaterThan(BigInteger.ZERO);
    }

    @Override
    public BigIntegerAssertion isNegative() {
        return isLessThan(BigInteger.ZERO);
    }

    @Override
    public BigIntegerAssertion isZero() {
        isNotNull();
        return isEqualTo(BigInteger.ZERO);
    }

    @Override
    protected BigIntegerAssertion me() {
        return this;
    }
}
