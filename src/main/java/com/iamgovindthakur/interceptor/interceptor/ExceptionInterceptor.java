package com.iamgovindthakur.interceptor.interceptor;

import com.iamgovindthakur.interceptor.exception.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionInterceptor {


    @ExceptionHandler({CustomerNotFoundException.class})

    public ResponseEntity<String> customerNotFoundException(CustomerNotFoundException customerNotFoundException)
    {
        return new ResponseEntity<>(customerNotFoundException.getMessage(), HttpStatus.ACCEPTED);
    }

}
