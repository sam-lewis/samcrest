package bling.assertion.assertions;

import static bling.assertion.AssertionFailure.failWhen;

public class ThrowableAssertion extends Assertion<ThrowableAssertion, Throwable> {
    public ThrowableAssertion(Throwable value) {
        super(value);
    }

    public ThrowableAssertion hasCause() {
        isNotNull();
        failWhen(value().getCause() == null, "throwable does not not have a cause");
        return me();
    }

    public ThrowableAssertion causeIsInstanceOf(Class<? extends Throwable> clazz) {
        hasCause();
        failWhen(clazz.isAssignableFrom(value().getCause().getClass()), "cause class %s is not an instance of %s", value().getCause().getClass(), clazz);
        return me();
    }

    public ThrowableAssertion hasMessage(String message) {
        isNotNull();
        failWhen(!value().getMessage().equals(message), "unexpected message [$s]", value().getMessage());
        return me();
    }

    //TODO root cause based methods

    @Override
    protected ThrowableAssertion me() {
        return this;
    }
}
