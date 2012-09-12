package bling.assertion.assertions;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class LongAssertion extends Assertion<LongAssertion, Long> implements NumberAssertion<LongAssertion, Long> {

    public LongAssertion(Long value) {
        super(value);
    }

    @Override
    public LongAssertion isGreaterThan(Long number) {
        isNotNull();
        failWhenFalse(value() > number, "[%s] is not greater than [%s]", value(), number);
        return me();
    }

    @Override
    public LongAssertion isGreaterThanOrEqualTo(Long number) {
        isNotNull();
        failWhenFalse(value() >= number, "[%s] is not greater than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public LongAssertion isLessThan(Long number) {
        isNotNull();
        failWhenFalse(value() < number, "[%s] is not less than [%s]", value(), number);
        return me();
    }

    @Override
    public LongAssertion isLessThanOrEqualTo(Long number) {
        isNotNull();
        failWhenFalse(value() <= number, "[%s] is not less than or equal to [%s]", value(), number);
        return me();
    }

    @Override
    public LongAssertion isPositive() {
        return isGreaterThan(0L);
    }

    @Override
    public LongAssertion isNegative() {
        return isLessThan(0L);
    }

    @Override
    public LongAssertion isZero() {
        isNotNull();
        return isEqualTo(0L);
    }

    @Override
    protected LongAssertion me() {
        return this;
    }
}
