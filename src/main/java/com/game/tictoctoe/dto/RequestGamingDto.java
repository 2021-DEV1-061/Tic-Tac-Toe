package com.game.tictoctoe.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestGamingDto {

    private String playerAlphabet ;

    private Integer xPosition;
    
    private Integer yPosition;

}