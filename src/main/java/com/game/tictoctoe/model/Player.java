package com.game.tictoctoe.model;

import com.game.tictoctoe.enums.PlayerSymbol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player implements Comparable<Player> {

    private final String name;
    private final PlayerSymbol playerSymbol;

    public Player(String name, PlayerSymbol playerSymbol) {
        this.name = name;
        this.playerSymbol = playerSymbol;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((playerSymbol == null) ? 0 : playerSymbol.hashCode());
        return result;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (playerSymbol != other.playerSymbol)
            return false;
        return true;
    }

    @Override
    public int compareTo(Player player) {
        return name.compareTo(player.getName());
    }

}
