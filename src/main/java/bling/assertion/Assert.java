package bling.assertion;

import bling.assertion.assertions.CollectionAssertion;
import bling.assertion.assertions.ObjectAssertion;
import bling.assertion.assertions.StringAssertion;

import java.util.Collection;

public final class Assert {

    private Assert() {
    }

    public static CollectionAssertion assertThat(Collection collection) {
        return new CollectionAssertion(collection);
    }

    public static ObjectAssertion assertThat(Object object) {
        return new ObjectAssertion(object);
    }

    public static StringAssertion assertThat(String string) {
        return new StringAssertion(string);
    }

}
