package com.mftplus.simcardmicroservice.controller.exception;

public class NoContentException extends Exception {
    public NoContentException() {
        super("Person Not Found !!!");
    }
}
