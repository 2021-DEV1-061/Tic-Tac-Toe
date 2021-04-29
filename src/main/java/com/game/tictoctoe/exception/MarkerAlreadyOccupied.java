package com.game.tictoctoe.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MarkerAlreadyOccupied extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MarkerAlreadyOccupied() {
        super("Marker position already occupied");
    }

    public MarkerAlreadyOccupied(String message) {
        super(message);
    }
}