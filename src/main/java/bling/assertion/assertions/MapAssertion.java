package bling.assertion.assertions;

import java.util.Map;

import static bling.assertion.AssertionFailure.failWhen;

public class MapAssertion extends Assertion<MapAssertion, Map<?, ?>> {
    public MapAssertion(Map<?, ?> value) {
        super(value);
    }

    public MapAssertion containsKey(Object key) {
        isNotNull();
        failWhen(!value().containsKey(key), "map does not not contain key [%s]", key);
        return me();
    }

    //TODO: hasSize()

    @Override
    protected MapAssertion me() {
        return this;
    }
}
