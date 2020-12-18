package Minefield;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Board board = new Board();
		
		int rounds = 0;
		int minesAround = 0;
		int line = 0;
		int column = 0;
		int i = 0;
		
		board.initialBoard();
		board.initialBoardComparator();
		board.sortMines();		
		System.out.println("Welcome to the minefield");
		System.out.println(board.toString());
		
		while (true) {
			
			while (i < 2) {
				
				if (i == 0) {
					System.out.print("Choose the line where you want to play [1/8]: ");
					line = sc.nextInt();
					if (line <=8 && line >= 1) {
						i++;
					}
				}
				if (i == 1) {
					System.out.print("Choose the column where you want to play [1/8]: ");
					column = sc.nextInt();
					if (column <= 8 && line >= 1) {
						i++;
					}
				}	
			}
			i = 0;
			rounds += 1;
			minesAround = 0;
			
			if (board.getBoardComparator()[line][column] == board.getBoard()[line][column]) {
				
				// - line / - column 
				if ((line - 1) >= 1 && (column - 1) >= 1) {
					if (board.getBoardComparator()[line - 1][column - 1] != board.getBoard()[line - 1 ][column - 1]) {
						minesAround += 1;
					}
				}
				// - line / column
				if ((line -1) >= 1) {
					if (board.getBoardComparator()[line - 1][column] != board.getBoard()[line - 1][column]){
						minesAround += 1;
					}
				}
				// - line / + column
				if ((line - 1) >= 1 && (column + 1) <= 8) {
					if (board.getBoardComparator()[line - 1][column + 1] != board.getBoard()[line - 1][column + 1]) {
						minesAround += 1;
					}
				}
				// line / - column
				if ((column - 1) >= 1) {
					if (board.getBoardComparator()[line][column - 1] != board.getBoard()[line][column - 1]) {
						minesAround += 1;
					}
				}
				// line / + column
				if ((column + 1) <= 8) {
					if (board.getBoardComparator()[line][column + 1] != board.getBoard()[line][column + 1]) {
						minesAround += 1;
					}
				}
				// + line / - column
				if ((line + 1) <= 8 && (column - 1) >= 1) {
					if (board.getBoardComparator()[line + 1][column - 1] != board.getBoard()[line + 1][column - 1]) {
						minesAround += 1;
					}
				}
				// + line / column
				if ((line + 1) <= 8) {
					if (board.getBoardComparator()[line + 1][column] != board.getBoard()[line + 1][column]) {
						minesAround += 1;
					}
				}
				// + line / + column
				if ((line + 1) <= 8 && (column + 1) <= 8) {
					if (board.getBoardComparator()[line + 1][column + 1] != board.getBoard()[line + 1][column + 1]) {
						minesAround += 1;
					}
				}
				board.getBoard()[line][column] =  " " + Integer.toString(minesAround);
				minesAround = 0;
			}
			
			if (board.getBoardComparator()[line][column].equals("-1") != board.getBoard()[line][column].equals("-1")) {
				break;
			}
			
			System.out.println(board.toString());
			
			if (rounds == 54) {
				break;
			}
			
			
		}
		
		if (rounds == 54) {
			System.out.println("Congratulations you won");
		}
		else {
			System.out.println("Game Over");
			System.out.println(board.toStringComparator());
		}
		
		sc.close();	
	}

}
