package ves.com.villa1.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class PersonaExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNoFoundException(ResourceNotFoundException exception, WebRequest request) {
        var errorMsg = new ErrorMessage(HttpStatus.NOT_FOUND.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));

        log.error("#! Error: " + exception.getMessage());
        return new ResponseEntity<ErrorMessage>(errorMsg, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<?> globalExceptionHandler(Exception ex, WebRequest request) {
        var errorMsg = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        log.error("#! Error: " + ex.getMessage());
        return new ResponseEntity<>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
