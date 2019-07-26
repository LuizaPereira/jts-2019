package com.luizapereira.coreengineering.tema10.exceptions;

public class NonexistentPersonException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public NonexistentPersonException(String message) {
        super(message);
    }
}
