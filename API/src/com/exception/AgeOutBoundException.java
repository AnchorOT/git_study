package com.exception;

public class AgeOutBoundException extends RuntimeException{
    public AgeOutBoundException() {
    }

    public AgeOutBoundException(String message) {
        super(message);
    }
}
