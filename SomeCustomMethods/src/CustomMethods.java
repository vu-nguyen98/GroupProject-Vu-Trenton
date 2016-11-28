import java.util.Scanner;
public class CustomMethods {

	//a test int for player
	static int playerTurn;

	private static void displayBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

	}

	private static String[][] createBoard(int x, int y) {
		String[][] board = new String[x][y];

		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {

				board[i][j] = "|   |";
			}
		}
		return board;
	}
	private static int columnSelection() {
		Scanner input = new Scanner(System.in);
		int column = 0;
		boolean validSelection = false;

		while (validSelection == false) {
			if (playerTurn==1) {
				System.out.print("Enter the column for player X: ");
			}
			else {
				System.out.print("Enter the column for player O: ");
			}
			column = input.nextInt();
			if (column >=0) {
				if (column <=2) {
					validSelection = true;
				}
			}
			else System.out.println("Invalid input!");
			return column;
		}

		private static int rowSelection() {
			Scanner input = new Scanner(System.in);
			int row = 0;
			boolean validSelection = false;

			while (validSelection == false) {
				if (playerTurn==1) {
					System.out.print("Enter the row for player X: ");
				}
				else {
					System.out.print("Enter the row for player O: ");
				}
				row = input.nextInt();
				if (row >=0) {
					if (row <=2) {
						validSelection = true;
					}
				}
				else System.out.println("Invalid input!");
				return row;
			}



