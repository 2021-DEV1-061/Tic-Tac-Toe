package com.game.tictoctoe.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 */
@Getter
@Setter
public class Movement {

    Player player;

    public Movement(Player player) {
        this.player = player;
    }

}