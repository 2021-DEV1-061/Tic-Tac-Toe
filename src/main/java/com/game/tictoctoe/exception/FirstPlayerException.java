package com.game.tictoctoe.exception;


import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FirstPlayerException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public FirstPlayerException() {
        super("Player X should start First");
    }

    public FirstPlayerException(String message) {
        super(message);
    }
}