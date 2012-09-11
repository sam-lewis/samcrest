package bling.assertion.assertions;

public class ObjectAssertion extends Assertion<ObjectAssertion, Object> {

    public ObjectAssertion(Object value) {
        super(value);
    }

    @Override
    protected ObjectAssertion me() {
        return this;
    }
}
