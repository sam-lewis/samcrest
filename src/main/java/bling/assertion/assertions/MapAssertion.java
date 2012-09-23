package bling.assertion.assertions;

import com.google.common.base.Objects;

import java.util.Map;

import static bling.assertion.AssertionFailure.failWhen;
import static bling.assertion.AssertionFailure.failWhenFalse;

public class MapAssertion extends Assertion<MapAssertion, Map<?, ?>> {
    public MapAssertion(Map<?, ?> value) {
        super(value);
    }

    public MapAssertion containsKey(Object key) {
        isNotNull();
        failWhenFalse(value().containsKey(key), "map does not contain key [%s]", key);
        return me();
    }

    public MapAssertion containsKeys(Object... keys) {
        for(Object key : keys) {
            containsKey(key);
        }
        return me();
    }

    public MapAssertion containsValue(Object value) {
        isNotNull();
        failWhenFalse(value().containsValue(value), "map does not contain value [%s]", value);
        return me();
    }

    public MapAssertion containsValues(Object... values) {
        for(Object value : values) {
            containsKey(value);
        }
        return me();
    }

    public MapAssertion contains(Object key, Object value) {
        containsKey(key);

        Object actualValue = value().get(key);
        failWhenFalse(Objects.equal(value, actualValue), "value for key [%s] was [%s], expected [%s]", key, actualValue, value);

        return me();
    }

    public MapAssertion hasSize(int size) {
        isNotNull();
        failWhen(value().size() != size, "size is [%s], expected [%s]", value().size(), size);

        return me();
    }

    @Override
    protected MapAssertion me() {
        return this;
    }
}
