package bling.assertion.assertions;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class ShortAssertion extends Assertion<ShortAssertion, Short> implements NumberAssertion<ShortAssertion, Short> {

    public ShortAssertion(Short value) {
        super(value);
    }

    @Override
    public ShortAssertion isGreaterThan(Short number) {
        isNotNull();
        failWhenFalse(value() > number, "[%s] is not greater than [%s]", value(), number);
        return me();
    }

    @Override
    public ShortAssertion isGreaterThanOrEqualTo(Short number) {
        isNotNull();
        failWhenFalse(value() >= number, "[%s] is not greater than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public ShortAssertion isLessThan(Short number) {
        isNotNull();
        failWhenFalse(value() < number, "[%s] is not less than [%s]", value(), number);
        return me();
    }

    @Override
    public ShortAssertion isLessThanOrEqualTo(Short number) {
        isNotNull();
        failWhenFalse(value() <= number, "[%s] is not less than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public ShortAssertion isPositive() {
        return isGreaterThan((short) 0);
    }

    @Override
    public ShortAssertion isNegative() {
        return isLessThan((short) 0);
    }

    @Override
    public ShortAssertion isZero() {
        isNotNull();
        return isEqualTo((short) 0);
    }

    @Override
    protected ShortAssertion me() {
        return this;
    }
}
