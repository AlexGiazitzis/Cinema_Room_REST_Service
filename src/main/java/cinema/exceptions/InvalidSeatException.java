package cinema.exceptions;

/**
 * @author Alex Giazitzis
 */
public class InvalidSeatException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidSeatException(String message) {
        super(message);
    }
}
