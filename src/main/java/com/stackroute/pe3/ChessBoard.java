package com.stackroute.pe3;

public class ChessBoard {

//	creates chess board pattern
	public void chessPattern() {
		
		System.out.println("My Chess Board");
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((i+j)%2 == 0) {          //Print WW and BB alternatively
					System.out.print("WW|");
				} else {
					System.out.print("BB|");
				}
			}
			System.out.println();
		}
	}
}
