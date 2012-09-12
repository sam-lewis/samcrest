package bling.assertion.assertions;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class FloatAssertion extends Assertion<FloatAssertion, Float> implements NumberAssertion<FloatAssertion, Float> {

    public FloatAssertion(Float value) {
        super(value);
    }

    @Override
    public FloatAssertion isGreaterThan(Float number) {
        isNotNull();
        failWhenFalse(value() > number, "[%s] is not greater than [%s]", value(), number);
        return me();
    }

    @Override
    public FloatAssertion isGreaterThanOrEqualTo(Float number) {
        isNotNull();
        failWhenFalse(value() >= number, "[%s] is not greater than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public FloatAssertion isLessThan(Float number) {
        isNotNull();
        failWhenFalse(value() < number, "[%s] is not less than [%s]", value(), number);
        return me();
    }

    @Override
    public FloatAssertion isLessThanOrEqualTo(Float number) {
        isNotNull();
        failWhenFalse(value() <= number, "[%s] is not less than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public FloatAssertion isPositive() {
        return isGreaterThan(0f);
    }

    @Override
    public FloatAssertion isNegative() {
        return isLessThan(0f);
    }

    @Override
    public FloatAssertion isZero() {
        isNotNull();
        return isEqualTo(0f);
    }

    @Override
    protected FloatAssertion me() {
        return this;
    }
}
