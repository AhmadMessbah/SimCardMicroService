package com.mftplus.simcardmicroservice.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;

@ControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(Exception ex) {
        return ResponseEntity
                .status(404)
                .body("خطای ناشناخته - تماس با ادمین !!!" + ex.getMessage());
    }
    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(NoContentException ex) {
        return ResponseEntity
                .status(404)
                .body( ex.getMessage());
    }
    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<String> exceptionHandler1(Exception ex) {
        return ResponseEntity
                .status(404)
                .body("صفحه درخواستی وجود ندارد !!!");
    }

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<String> exceptionHandler2(Exception ex) {
        return ResponseEntity
                .status(500)
                .body("خطای سرور");
    }
}
