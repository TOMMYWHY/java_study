package com.j_se2.demo05_self_exception;

public class RegisterException extends Exception {
    public RegisterException(){
        super();
    }

    public RegisterException(String message) {
        super(message);
    }
}
