package bling.assertion.assertions;

public interface NumberAssertion<T extends Assertion<T, V>, V> {

    public T isGreaterThan(V number);

    public T isGreaterThanOrEqualTo(V number);

    public T isLessThan(V number);

    public T isLessThanOrEqualTo(V number);

    public T isPositive();

    public T isNegative();

    public T isZero();
}
