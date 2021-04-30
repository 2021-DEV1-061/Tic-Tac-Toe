package com.game.tictoctoe.enums;

import lombok.Getter;

@Getter
public enum MarkerValue {
    BLANK( "" ),
    X( "X" ),
    O( "O" );
    
    private String text;
    
    private MarkerValue( String text ) {
        this.text = text;
    }
    
    @Override
    public String toString() {
        return text;
    }
}