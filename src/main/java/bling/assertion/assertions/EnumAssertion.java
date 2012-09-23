package bling.assertion.assertions;

import static bling.assertion.AssertionFailure.failWhenFalse;

public class EnumAssertion extends Assertion<EnumAssertion, Enum>{

    public EnumAssertion(Enum value) {
        super(value);
    }

    public EnumAssertion hasOrdinal(int ordinal) {
        isNotNull();

        failWhenFalse(value().ordinal() != ordinal, "ordinal was [%s], expected [%s]", value().ordinal(), ordinal);

        return me();
    }


    @Override
    protected EnumAssertion me() {
        return this;
    }
}
