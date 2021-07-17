package com.fifi.technologies.tourist.exception;

import com.fifi.technologies.tourist.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class ExceptionHandlerHelper {

    @ExceptionHandler(value = {UserAlreadyExistsException.class})
    public ResponseEntity<ErrorResponse> handleInvalidInputException(UserAlreadyExistsException ex) {
        return new ResponseEntity<ErrorResponse>(new ErrorResponse("USER_EXISTS", ex.getMessage()), HttpStatus.CONFLICT);
    }


}
