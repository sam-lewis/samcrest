package bling.assertion.assertions;

import com.google.common.base.Objects;

import static bling.assertion.AssertionFailure.failWhen;

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
        failWhen(!Objects.equal(value(), o), "Objects are not equal");

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
