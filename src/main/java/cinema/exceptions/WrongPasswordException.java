package cinema.exceptions;

/**
 * @author Alex Giazitzis
 */
public class WrongPasswordException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public WrongPasswordException(final String message) {
        super(message);
    }
}