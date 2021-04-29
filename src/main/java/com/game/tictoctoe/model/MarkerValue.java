package com.game.tictoctoe.model;

public enum MarkerValue {
    BLANK( "" ),
    X( "X" ),
    O( "O" );
    
    private String value;
    
    private MarkerValue( String value ) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}