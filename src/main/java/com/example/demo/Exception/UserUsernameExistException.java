package com.example.demo.Exception;

public class UserUsernameExistException extends RuntimeException {

    public UserUsernameExistException (String msg) {
        super(msg);
    }
}
