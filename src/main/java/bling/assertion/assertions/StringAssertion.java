package bling.assertion.assertions;

import com.google.common.base.Strings;

import static bling.assertion.AssertionFailure.fail;
import static bling.assertion.AssertionFailure.failWhen;

public class StringAssertion extends Assertion<StringAssertion, String> {

    public StringAssertion(String value) {
        super(value);
    }

    @Override
    protected StringAssertion me() {
        return this;
    }

    public StringAssertion isNullOrEmpty() {
        failWhen(!Strings.isNullOrEmpty(value()), "[%s] was not null or empty", value());

        return me();
    }

    public StringAssertion hasSize(int size) {
        isNotNull();

        if (value().length() != size) {
            fail("[%s] is length %s, expected %s", value(), value().length(), size);
        }

        return me();
    }

}
