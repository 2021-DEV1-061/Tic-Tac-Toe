package com.game.tictoctoe.model;

import com.game.tictoctoe.enums.MarkerValue;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardMarker {

    private MarkerValue value;
    private int rowIndex;
    private int columnIndex;

    public BoardMarker(int rowIndex, int columnIndex) {

        this.value = MarkerValue.BLANK;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    /**
     * @return boolean
     */
    public boolean isEmpty() {
        return this.value == MarkerValue.BLANK;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "BoardMarker [columnIndex=" + columnIndex + ", rowIndex=" + rowIndex + ", value=" + value + "]";
    }

}