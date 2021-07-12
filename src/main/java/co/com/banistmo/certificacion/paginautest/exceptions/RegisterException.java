package co.com.banistmo.certificacion.paginautest.exceptions;

@SuppressWarnings("serial")
public class RegisterException extends AssertionError {
    public RegisterException(String message, Throwable cause) {
        super(message, cause);
    }
}
