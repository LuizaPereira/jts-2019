package com.luizapereira.coreengineering.tema11.exceptions;

public class InvalidAnimalException extends RuntimeException{

    public InvalidAnimalException(){
        super("This is not a valid animal.");
    }
}

