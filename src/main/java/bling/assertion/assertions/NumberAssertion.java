package bling.assertion.assertions;

public interface NumberAssertion<T extends Assertion<T, V>, V> {

    T isGreaterThan(V number);

    T isGreaterThanOrEqualTo(V number);

    T isLessThan(V number);

    T isLessThanOrEqualTo(V number);

    T isPositive();

    T isNegative();

    T isZero();
}
