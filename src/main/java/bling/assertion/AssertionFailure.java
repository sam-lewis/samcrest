package bling.assertion;

public class AssertionFailure extends RuntimeException {

    private AssertionFailure(String message) {
        super(message);
    }

    public static void fail(String message, Object... args) {
        throw new AssertionFailure(String.format(message, args));
    }

    public static void failWhen(boolean condition, String message, Object... args) {
        if (condition) {
            fail(message, args);
        }
    }
}
