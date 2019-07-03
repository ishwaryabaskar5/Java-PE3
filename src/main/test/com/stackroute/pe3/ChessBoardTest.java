package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ChessBoardTest {
	
	private ChessBoard chessBoard;
	private PrintStream originalOut = System.out;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		chessBoard = new ChessBoard();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
		chessBoard = null;
		System.setOut(originalOut);
	}
	
	@Test
	public void shouldReturnChessBoardPattern(){
		chessBoard.chessPattern();
		assertEquals("My Chess Board\n" +
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" +
				"BB|WW|BB|WW|BB|WW|BB|WW|\n" +
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" +
				"BB|WW|BB|WW|BB|WW|BB|WW|\n" +
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" +
				"BB|WW|BB|WW|BB|WW|BB|WW|\n" +
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" +
				"BB|WW|BB|WW|BB|WW|BB|WW|\n",outContent.toString());
	}
}
	