package cinema.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

/**
 * @author Alex Giazitzis
 */
@RestControllerAdvice
public class AdminExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(WrongPasswordException.class)
    public final ResponseEntity<ExceptionResponse> handleWrongPassword(WrongPasswordException ex, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(new Date(), HttpStatus.UNAUTHORIZED.value(),
                                                           ex.getMessage(),
                                                           "Please check the values you input.",
                                                           request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);

    }
}
