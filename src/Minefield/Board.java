package Minefield;

import java.util.Random;

public class Board {

	Random p1 = new Random();
	Random p2 = new Random();
	
	private String[][] board = new String[10][10];
	private String[][] boardComparator = new String[10][10];
	
	public String[][] getBoardComparator() {
		return boardComparator;
	}
	
	public void setBoardComparator(String[][] boardComparator) {
		this.boardComparator = boardComparator;
	}
	
	public String[][] getBoard() {
		return board;
	}
	public void setBoard(String[][] board) {
		this.board = board;
	}
	
	public String[][] initialBoard() {
	
		for (int i=1; i<this.getBoard().length; i++) {
			for (int j=1; j<this.getBoard()[i].length; j++) {
				board[i][j] = "[]";
			}
		}
		return this.getBoard();
	}
	
	public String[][] initialBoardComparator() {
		
		for (int i=1; i<this.getBoardComparator().length; i++) {
			for (int j=1; j<this.getBoardComparator()[i].length; j++) {
				boardComparator[i][j] = "[]";
			}
		}
		return this.getBoardComparator();
	}
	
	public String[][] sortMines() {
		int i = 0;
		while (i < 10) {
			int line = p1.nextInt(9);
			int column = p2.nextInt(9);

			if (line > 0 && column > 0) {
				if (boardComparator[line][column] != "-1") {
					boardComparator[line][column] = "-1";
					i++;
				}
			}		
		}
		return this.getBoardComparator();
	}
	
	
	
	
	@Override
	public String toString() {
		return board[1][1] + board[1][2] + board[1][3] + board[1][4] + board[1][5] + board[1][6] + board[1][7] + board[1][8]
				+ "\n" + board[2][1] + board[2][2] + board[2][3] + board[2][4] + board[2][5] + board[2][6] + board[2][7] + board[2][8]
				+ "\n" + board[3][1] + board[3][2] + board[3][3] + board[3][4] + board[3][5] + board[3][6] + board[3][7] + board[3][8] 
				+ "\n" + board[4][1] + board[4][2] + board[4][3] + board[4][4] + board[4][5] + board[4][6] + board[4][7] + board[4][8]
				+ "\n" + board[5][1] + board[5][2] + board[5][3] + board[5][4] + board[5][5] + board[5][6] + board[5][7] + board[5][8]
				+ "\n" + board[6][1] + board[6][2] + board[6][3] + board[6][4] + board[6][5] + board[6][6] + board[6][7] + board[6][8]
				+ "\n" + board[7][1] + board[7][2] + board[7][3] + board[7][4] + board[7][5] + board[7][6] + board[7][7] + board[7][8]
		        + "\n" + board[8][1] + board[8][2] + board[8][3] + board[8][4] + board[8][5] + board[8][6] + board[8][7] + board[8][8];
	}
	
	public String toStringComparator() {
		return boardComparator[1][1] + boardComparator[1][2] + boardComparator[1][3] + boardComparator[1][4] + boardComparator[1][5] + boardComparator[1][6] + boardComparator[1][7] + boardComparator[1][8]
				+ "\n" + boardComparator[2][1] + boardComparator[2][2] + boardComparator[2][3] + boardComparator[2][4] + boardComparator[2][5] + boardComparator[2][6] + boardComparator[2][7] + boardComparator[2][8]
				+ "\n" + boardComparator[3][1] + boardComparator[3][2] + boardComparator[3][3] + boardComparator[3][4] + boardComparator[3][5] + boardComparator[3][6] + boardComparator[3][7] + boardComparator[3][8]
				+ "\n" + boardComparator[4][1] + boardComparator[4][2] + boardComparator[4][3] + boardComparator[4][4] + boardComparator[4][5] + boardComparator[4][6] + boardComparator[4][7] + boardComparator[4][8]
				+ "\n" + boardComparator[5][1] + boardComparator[5][2] + boardComparator[5][3] + boardComparator[5][4] + boardComparator[5][5] + boardComparator[5][6] + boardComparator[5][7] + boardComparator[5][8]
				+ "\n" + boardComparator[6][1] + boardComparator[6][2] + boardComparator[6][3] + boardComparator[6][4] + boardComparator[6][5] + boardComparator[6][6] + boardComparator[6][7] + boardComparator[6][8]
				+ "\n" + boardComparator[7][1] + boardComparator[7][2] + boardComparator[7][3] + boardComparator[7][4] + boardComparator[7][5] + boardComparator[7][6] + boardComparator[7][7] + boardComparator[7][8]
		        + "\n" + boardComparator[8][1] + boardComparator[8][2] + boardComparator[8][3] + boardComparator[8][4] + boardComparator[8][5] + boardComparator[8][6] + boardComparator[8][7] + boardComparator[8][8];
	}
}
