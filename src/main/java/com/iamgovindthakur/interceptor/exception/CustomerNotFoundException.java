package com.iamgovindthakur.interceptor.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomerNotFoundException extends  RuntimeException{
    String message;

}
