package com.game.tictoctoe.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Board {

    public static final int NUMBER_ROWS = 3;
    public static final int NUMBER_COLUMNS = 3;

    private BoardMarker[][] boardMarkers;

    public Board() {

        boardMarkers = new BoardMarker[ NUMBER_ROWS ][ NUMBER_COLUMNS ];

		for ( int rowIndex = 0; rowIndex < NUMBER_ROWS; rowIndex++ ) {
			for ( int columnIndex = 0; columnIndex < NUMBER_COLUMNS; columnIndex++ ) {
				boardMarkers[ rowIndex ][ columnIndex ] = new BoardMarker( rowIndex, columnIndex );
			}
		}
    }

    public void reset() {
		for ( BoardMarker[] row : boardMarkers ) {
			for ( BoardMarker marker : row ) {
				marker.setValue( MarkerValue.BLANK );
			}
		}
	}



}