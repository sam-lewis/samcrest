package bling.assertion.assertions;

import com.google.common.base.Objects;

import static bling.assertion.AssertionFailure.failWhen;
import static bling.assertion.AssertionFailure.failWhenFalse;

public abstract class Assertion<T extends Assertion<T, V>, V> {

    private final V value;

    protected Assertion(V value) {
        this.value = value;
    }

    public T isNotNull() {
        failWhen(value == null, "value is null");
        return me();
    }

    public T isNull() {
        failWhen(value() != null, "value is not null");
        return me();
    }

    public T isEqualTo(Object o) {
        failWhenFalse(Objects.equal(value(), o), "objects are not equal");

        return me();
    }

    public T isNotEqualTo(Object o) {
        isNotNull();
        failWhen(Objects.equal(value(), o), "objects are equal");

        return me();
    }

    public T isSameAs(Object o) {
        isNotNull();
        failWhen(value() != o, "objects are not the same");

        return me();
    }

    public T isNotSameAs(Object o) {
        isNotNull();
        failWhen(value() == o, "objects are the same");

        return me();
    }

    public T hasHashCode(int hashCode) {
        isNotNull();
        failWhenFalse(value().hashCode() != hashCode, "hashCodes do not match, expected [%s] actual [%s]", hashCode, value().hashCode());

        return me();
    }

    public T hasToString(String string) {
        isNotNull();

        failWhenFalse(Objects.equal(value().toString(), string), "expected toString() [%s], actual [%s]", string, value().toString());

        return me();
    }


    @Override
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    protected V value() {
        return value;
    }

    protected abstract T me();

}
