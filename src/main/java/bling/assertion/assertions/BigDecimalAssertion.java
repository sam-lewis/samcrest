package bling.assertion.assertions;

import java.math.BigDecimal;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class BigDecimalAssertion extends Assertion<BigDecimalAssertion, BigDecimal> implements NumberAssertion<BigDecimalAssertion, BigDecimal> {

    public BigDecimalAssertion(BigDecimal value) {
        super(value);
    }

    @Override
    public BigDecimalAssertion isGreaterThan(BigDecimal number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) == 1, "[%s] is not greater than [%s]", value(), number);
        return me();
    }

    @Override
    public BigDecimalAssertion isGreaterThanOrEqualTo(BigDecimal number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) >= 0, "[%s] is not greater than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public BigDecimalAssertion isLessThan(BigDecimal number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) == -1, "[%s] is not less than [%s]", value(), number);
        return me();
    }

    @Override
    public BigDecimalAssertion isLessThanOrEqualTo(BigDecimal number) {
        isNotNull();
        failWhenFalse(value().compareTo(number) <= 0, "[%s] is not less than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public BigDecimalAssertion isPositive() {
        return isGreaterThan(BigDecimal.ZERO);
    }

    @Override
    public BigDecimalAssertion isNegative() {
        return isLessThan(BigDecimal.ZERO);
    }

    @Override
    public BigDecimalAssertion isZero() {
        isNotNull();
        return isEqualTo(BigDecimal.ZERO);
    }

    @Override
    protected BigDecimalAssertion me() {
        return this;
    }
}
