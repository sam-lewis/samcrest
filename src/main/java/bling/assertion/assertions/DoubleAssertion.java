package bling.assertion.assertions;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class DoubleAssertion extends Assertion<DoubleAssertion, Double> implements NumberAssertion<DoubleAssertion, Double> {

    public DoubleAssertion(Double value) {
        super(value);
    }

    @Override
    public DoubleAssertion isGreaterThan(Double number) {
        isNotNull();
        failWhenFalse(value() > number, "[%s] is not greater than [%s]", value(), number);
        return me();
    }

    @Override
    public DoubleAssertion isGreaterThanOrEqualTo(Double number) {
        isNotNull();
        failWhenFalse(value() >= number, "[%s] is not greater than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public DoubleAssertion isLessThan(Double number) {
        isNotNull();
        failWhenFalse(value() < number, "[%s] is not less than [%s]", value(), number);
        return me();
    }

    @Override
    public DoubleAssertion isLessThanOrEqualTo(Double number) {
        isNotNull();
        failWhenFalse(value() <= number, "[%s] is not less than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public DoubleAssertion isPositive() {
        return isGreaterThan(0d);
    }

    @Override
    public DoubleAssertion isNegative() {
        return isLessThan(0d);
    }

    @Override
    public DoubleAssertion isZero() {
        isNotNull();
        return isEqualTo(0d);
    }

    @Override
    protected DoubleAssertion me() {
        return this;
    }
}
