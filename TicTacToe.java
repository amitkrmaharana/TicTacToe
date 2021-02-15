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
		System.out.println(board[7] + "  | " + board[8] + " | " + board[9]);
		System.out.println("--------------");
		System.out.println(board[4] + "  | " + board[5] + " | " + board[6]);
		System.out.println("--------------");
		System.out.println(board[1] + "  | " + board[2] + " | " + board[3]);
	}
	public char[] userInput(char[] board, char player) {
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
		return board;
	}
	public int firstChance() {
		double toss = Math.floor(Math.random() * 10 ) % 2;
		if ((int)toss == 0) {
			System.out.println("Player won the toss");
			return 1;
		} else {
			System.out.println("Computer won the toss");
			return 0;
		}
	}
	public char[] computerPlay(char[] board, char computer) {
		int place = (int)Math.floor(Math.random() * 10) % 9 + 1;
		if (board[place] == ' ') {
			board[place] = computer;
		}
		else {
			System.out.println("Place already occupied");
		}
		return board;
	}
	public int winTie(char[] board) {
		int result = 0;
		if (board[1] == board[2] && board[3] == board[1] && board[3] != ' ') {
			result = 1;
		} 
		else if (board[4] == board[5] && board[4] == board[6] && board[4] != ' ') {
			result = 1;
		}
		else if (board[7] == board[8] && board[8] == board[9] && board[8] != ' ') {
			result = 1;
		}
		else if (board[1] == board[4] && board[1] == board[7] && board[1] != ' ') {
			result = 1;
		}
		else if (board[2] == board[5] && board[8] == board[5] && board[8] != ' ') {
			result = 1;
		}
		else if (board[3] == board[6] && board[9] == board[6] && board[6] != ' ') {
			result = 1;
		}
		else if (board[1] == board[5] && board[9] == board[5] && board[9] != ' ') {
			result = 1;
		}
		else if (board[3] == board[5] && board[5] == board[7] && board[5] != ' ') {
			result = 1;
		}
		else {
			int empty = 0;
			for (int i = 0; i < board.length; i++) {
				if (board[i] == ' ') {
					empty = 1; 
				}
			}
			if (empty == 0) {
				result = 0;
			}
			else
				result = 2;
		}
		return result;
	}
	public static void main(String[] args) {
		int result;
		char value = 'x',computer;
		System.out.println("Welcome to tictactoe game");
		TicTacToe game = new TicTacToe();
		char[] board = game.gameBoard();
		char player = game.playerSelection();
		int compare = Character.compare(player, value);
		if (compare == 0) {
			player = 'x';
			computer = 'o';
		} else {
			player = 'o';
			computer = 'x';
		}
		game.showBoard(board);
		int chance = game.firstChance();
		boolean check = true;
		while(check == true) {
			if (chance == 1) {
				board = game.userInput(board, player);
				result = game.winTie(board);
				if (result == 0) {
					System.out.println("The game is a Tie");
					check = false;
				}
				else if (result == 1) {
					System.out.println("Player is the winner");
					check = false;
				}
				else {
					System.out.println("Computer's chance to play");
					game.showBoard(board);
					chance = 0;
				}
			}
			else {
				board = game.computerPlay(board, computer);
				result = game.winTie(board);
				if (result == 0) {
					System.out.println("The game is a Tie");
					check = false;
				}
				else if (result == 1) {
					System.out.println("Computer is the winner");
					check = false;
				}
				else {
					System.out.println("Player's chance to play");
					game.showBoard(board);
					chance = 1;
				}
			}
			
		}
		game.showBoard(board);
		
	}
}
