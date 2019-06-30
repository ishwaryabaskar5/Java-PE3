package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
	
	@Test
	public void createChessPattern(){
		ChessBoard chessBoard = new ChessBoard();
		chessBoard.chessPattern();
	}
}