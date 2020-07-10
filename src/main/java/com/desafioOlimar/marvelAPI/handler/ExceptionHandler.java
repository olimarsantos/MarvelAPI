package com.desafioOlimar.marvelAPI.handler;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import javax.persistence.EntityNotFoundException;
import java.net.BindException;

@ControllerAdvice
public class ExceptionHandler {

    private ResponseEntity<String> getResponse(FieldError fieldError){
        String message = fieldError == null ? "Invalid Parameter" : fieldError.getDefaultMessage();

        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler({MethodArgumentNotValidException.class})
    protected ResponseEntity<String> handleConflict(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldErrors().stream().findFirst().orElse(null);

        return getResponse(fieldError);
    }


    @org.springframework.web.bind.annotation.ExceptionHandler({ConversionNotSupportedException.class})
    protected ResponseEntity<String> handleConversionNotSupportedConflict(BindException ex) {
        return new ResponseEntity<>("Invalid parameter", HttpStatus.BAD_REQUEST);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler({Exception.class})
    protected ResponseEntity<String> handleException(Exception ex) {
        return new ResponseEntity<>("Unknown Error", HttpStatus.BAD_REQUEST);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler({EntityNotFoundException.class})
    protected ResponseEntity<String> handleNotFound(EntityNotFoundException ex) {
        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }
}
