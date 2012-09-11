package bling.assertion.assertions;

import java.util.Collection;

import static bling.assertion.AssertionFailure.failWhen;

public class CollectionAssertion extends Assertion<CollectionAssertion, Collection<?>> {

    public CollectionAssertion(Collection<?> value) {
        super(value);
    }

    public CollectionAssertion isEmpty() {
        isNotNull();

        failWhen(!value().isEmpty(), "Collection is not empty, actual size %s", value().size());
        return me();
    }

    @Override
    protected CollectionAssertion me() {
        return this;
    }
}
