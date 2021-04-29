package com.game.tictoctoe.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MarkerOutsideBoardException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MarkerOutsideBoardException() {
        super("Marker outside the bound");
    }

    public MarkerOutsideBoardException(String message) {
        super(message);
    }
}