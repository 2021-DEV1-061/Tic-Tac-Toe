package com.game.tictoctoe.exception;


import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NextPlayerNotDifferentException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NextPlayerNotDifferentException() {
        super("Next player should be different");
    }

    public NextPlayerNotDifferentException(String message) {
        super(message);
    }
}