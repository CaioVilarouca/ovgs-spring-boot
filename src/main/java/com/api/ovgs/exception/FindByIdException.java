package com.api.ovgs.exception;

public class FindByIdException extends RuntimeException {
    public FindByIdException(String message){
        super(message);
    }
}
