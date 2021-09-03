package cinema.exceptions;

/**
 * @author Alex Giazitzis
 */
public class WrongTokenException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public WrongTokenException(final String message) {
        super(message);
    }
}
