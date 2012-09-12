package bling.assertion.assertions;

import com.google.common.base.Strings;

import static bling.assertion.AssertionFailure.failWhen;
import static bling.assertion.AssertionFailure.failWhenFalse;

public class CharSequenceAssertion extends Assertion<CharSequenceAssertion, CharSequence> {

    public CharSequenceAssertion(CharSequence value) {
        super(value);
    }

    public CharSequenceAssertion isNullOrEmpty() {
        failWhen(!Strings.isNullOrEmpty(valueAsString()), "[%s] is not null or empty", value());

        return me();
    }

    public CharSequenceAssertion isEqualToIgnoringCase(String s) {
        isNotNull();
        failWhenFalse(valueAsString().equalsIgnoreCase(s), "[%s] is not equal to [%s] ignoring case", value(), s);

        return me();
    }

    public CharSequenceAssertion isNotEqualToIgnoringCase(String s) {
        isNotNull();
        failWhen(valueAsString().equalsIgnoreCase(s), "[%s] is equal to [%s] ignoring case", value(), s);

        return me();
    }

    public CharSequenceAssertion startsWith(String s) {
        isNotNull();
        failWhenFalse(valueAsString().startsWith(s), "[%s] does not start with [%s]", value(), s);

        return me();
    }

    public CharSequenceAssertion doesNotStartWith(String s) {
        isNotNull();
        failWhen(valueAsString().startsWith(s), "[%s] starts with [%s]", value(), s);

        return me();
    }


    public CharSequenceAssertion endsWIth(String s) {
        isNotNull();
        failWhenFalse(valueAsString().endsWith(s), "[%s] does not end with [%s]", value(), s);

        return me();
    }

    public CharSequenceAssertion matchesRegex(String regex) {
        isNotNull();
        failWhenFalse(valueAsString().matches(regex), "[%s] does not match regex [%s]", value(), regex);

        return me();
    }

    public CharSequenceAssertion doesNotmatchRegex(String regex) {
        isNotNull();
        failWhen(valueAsString().matches(regex), "[%s] matches regex [%s]", value(), regex);

        return me();
    }

    public CharSequenceAssertion hasSize(int size) {
        isNotNull();

        failWhen(value().length() != size, "[%s] is length %s, expected %s", value(), value().length(), size);

        return me();
    }

    @Override
    protected CharSequenceAssertion me() {
        return this;
    }

    private String valueAsString() {
        return value() == null ? null : value().toString();
    }
}
