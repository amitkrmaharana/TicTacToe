public class TicTacToe {
	public void gameBoard() {
		char[] board = new char[10];
		System.out.println(board);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to tictactoe game");
		TicTacToe game = new TicTacToe();
		game.gameBoard();
	}

}

