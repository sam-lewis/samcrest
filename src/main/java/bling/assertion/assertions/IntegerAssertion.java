package bling.assertion.assertions;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class IntegerAssertion extends Assertion<IntegerAssertion, Integer> implements NumberAssertion<IntegerAssertion, Integer> {

    public IntegerAssertion(Integer value) {
        super(value);
    }

    @Override
    public IntegerAssertion isGreaterThan(Integer number) {
        isNotNull();
        failWhenFalse(value() > number, "[%s] is not greater than [%s]", value(), number);
        return me();
    }

    @Override
    public IntegerAssertion isGreaterThanOrEqualTo(Integer number) {
        isNotNull();
        failWhenFalse(value() >= number, "[%s] is not greater than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public IntegerAssertion isLessThan(Integer number) {
        isNotNull();
        failWhenFalse(value() < number, "[%s] is not less than [%s]", value(), number);
        return me();
    }

    @Override
    public IntegerAssertion isLessThanOrEqualTo(Integer number) {
        isNotNull();
        failWhenFalse(value() <= number, "[%s] is not less than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public IntegerAssertion isPositive() {
        return isGreaterThan(0);
    }

    @Override
    public IntegerAssertion isNegative() {
        return isLessThan(0);
    }

    @Override
    public IntegerAssertion isZero() {
        isNotNull();
        return isEqualTo(0);
    }

    @Override
    protected IntegerAssertion me() {
        return this;
    }
}
