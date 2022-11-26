package com.iamgovindthakur.interceptor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Homepage", HttpStatus.ACCEPTED);
    }
}
