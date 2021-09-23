package com.bridgelabz.workshop;

public class TicTacGame {

	public static char[] character;

	public static void main(String[] args) {
		System.out.println(" tic tac toe game");
		boardCreation();
	}

	public static void boardCreation() {
		char[] character = new char[10];
		for (int i = 1; i < 10; i++) {
			character[i] = ' ';
		}
		System.out.println(" tic tac board");
	}
}
