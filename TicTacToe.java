public class TicTacToe {
	public void gameBoard() {
		char[] board = new char[10];
		for(int i=0;i<10;i++) {
			board[i] = ' ';
			System.out.println(board[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to tictactoe game");
		TicTacToe game = new TicTacToe();
		game.gameBoard();
	}

}
