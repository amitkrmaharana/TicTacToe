import java.util.Arrays;
import java.util.Scanner;
public class TicTacToe {
	public char[] gameBoard() {
		char[] board = new char[10];
		for(int i = 1; i < board.length; i++) {
			board[i] = ' ';
			
		}
		return board;
	}
	public char playerSelection() {
		char player, comp;
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
		return player;
	}
	public void showBoard(char[] board) {
		System.out.println(board[1] + "  | " + board[2] + " | " + board[3]);
		System.out.println("--------------");
		System.out.println(board[4] + "  | " + board[5] + " | " + board[6]);
		System.out.println("--------------");
		System.out.println(board[7] + "  | " + board[8] + " | " + board[9]);
	}
	public void userInput(char[] board, char player) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 9");
		int user_input = input.nextInt();
		if (user_input < 10 && user_input > 0) {
			if (board[user_input] == ' ') {
				board[user_input] = player;
			}
			else
				System.out.println("Place is already taken");
		}
		else
			System.out.println("Invalid Input");
	}
	public void firstChance() {
		double toss = Math.floor(Math.random() * 10 ) % 2;
		if ((int)toss == 0)
			System.out.println("Player won the toss");
		else
			System.out.println("Computer won the toss");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to tictactoe game");
		TicTacToe game = new TicTacToe();
		char[] board = game.gameBoard();
		char player = game.playerSelection();
		game.showBoard(board);
		game.userInput(board, player);
		game.showBoard(board);
		game.firstChance();
	}
}
