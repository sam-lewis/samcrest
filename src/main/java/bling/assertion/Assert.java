package bling.assertion;

import bling.assertion.assertions.*;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public final class Assert {

    private Assert() {
    }

    public static BigDecimalAssertion assertThat(BigDecimal value) {
        return new BigDecimalAssertion(value);
    }

    public static BigIntegerAssertion assertThat(BigInteger value) {
        return new BigIntegerAssertion(value);
    }

    public static CharSequenceAssertion assertThat(CharSequence value) {
        return new CharSequenceAssertion(value);
    }

    public static DoubleAssertion assertThat(Double value) {
        return new DoubleAssertion(value);
    }

    public static FileAssertion assertThat(File value) {
        return new FileAssertion(value);
    }

    public static FloatAssertion assertThat(Float value) {
        return new FloatAssertion(value);
    }

    public static IntegerAssertion assertThat(Integer value) {
        return new IntegerAssertion(value);
    }

    public static IterableAssertion assertThat(Iterable<?> value) {
        return new IterableAssertion(value);
    }

    public static LongAssertion assertThat(Long value) {
        return new LongAssertion(value);
    }

    public static MapAssertion assertThat(Map<?, ?> value) {
        return new MapAssertion(value);
    }

    public static ObjectAssertion assertThat(Object value) {
        return new ObjectAssertion(value);
    }

    public static ShortAssertion assertThat(Short value) {
        return new ShortAssertion(value);
    }

    public static ThrowableAssertion assertThat(Throwable value) {
        return new ThrowableAssertion(value);
    }
}
