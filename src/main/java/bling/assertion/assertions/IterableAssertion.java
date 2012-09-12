package bling.assertion.assertions;

import com.google.common.collect.Iterables;

import java.util.Arrays;

import static bling.assertion.AssertionFailure.failWhen;
import static bling.assertion.AssertionFailure.failWhenFalse;

public class IterableAssertion extends Assertion<IterableAssertion, Iterable<?>> {

    public IterableAssertion(Iterable<?> value) {
        super(value);
    }

    public IterableAssertion isEmpty() {
        isNotNull();

        failWhenFalse(Iterables.isEmpty(value()), "Collection is not empty, actual size %s", Iterables.size(value()));
        return me();
    }

    public IterableAssertion contains(Object o) {
        isNotNull();

        failWhenFalse(Iterables.contains(value(), o), "%s does not contain %s", value(), o);
        return me();
    }

    public IterableAssertion doesNotContain(Object o) {
        isNotNull();

        failWhen(Iterables.contains(value(), o), "%s does contains contain %s", value(), o);
        return me();
    }

    public IterableAssertion containsAll(Object... objects) {
        return containsAll(Arrays.asList(objects));
    }

    public IterableAssertion containsAll(Iterable<?> objects) {
        isNotNull();

        for (Object o : objects) {
            failWhenFalse(Iterables.contains(value(), o), "%s does not contain %s", value(), o);
        }

        return me();
    }


    //TODO: contains()
    //TODO: containsAll()
    //TODO: containsAny()
    //TODO: containsOnly()


    @Override
    protected IterableAssertion me() {
        return this;
    }
}
