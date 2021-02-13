import java.util.Scanner;
public class TicTacToe {
	public void gameBoard() {
		char[] board = new char[10];
		for(int i = 1; i < board.length; i++) {
			board[i] = ' ';
			System.out.println(board[i]);
		}
	}
	public void playerSelection() {
		char player;
		char comp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x for chhosing cross and enter o for choosing circle");
		char selection = input.next().charAt(0);
		if (selection == 'x') {
			player = 'x';
			comp = 'o';
		}
		else {
			player = 'o';
			comp = 'x';
		}
		System.out.println("Player is " + player + " and Computer is " + comp);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to tictactoe game");
		TicTacToe game = new TicTacToe();
		game.gameBoard();
		game.playerSelection();
		
	}
}
