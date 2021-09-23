package com.bridgelabz.workshop;

import java.util.Scanner;

public class TicTacGame {

	static char x='X';
	static char o='O';
	public static void main(String[] args) {
		System.out.println("Input between X or O");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();
		
		if (ch == 'x' || ch == 'o' || ch == 'X' || ch == 'O')
			System.out.println("You have entered "+x);
		 else
			System.out.println( " You have entered"+o);
		
	}
}
	
		
		/*
		 * public static char[] character;
		 * 
		 * public static void main(String[] args) {
		 * System.out.println(" tic tac toe game"); boardCreation(); }
		 * 
		 * public static void boardCreation() { char[] character = new char[10]; for
		 * (int i = 1; i < 10; i++) { character[i] = ' '; }
		 * System.out.println(" tic tac board"); }
		 */

		

			
