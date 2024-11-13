package interview.questions.exceptions;

/**
 * If I extend this class from Exception class, then it's called Checked Exception -> Java will ask the programmer to handle
 * this Exception at compile time
 * If I extend this class from RunTimeException class, then it's called UnChecked Exception -> It will be checked at Run Time
 */
public class AgeLessThanZeroException extends Exception {

    public AgeLessThanZeroException() {

    }

    public AgeLessThanZeroException(String message) {
        super(message);
    }

    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessThanZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
