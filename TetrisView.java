package net.mrpaul.ads.QM020.tetris;


//DELETE THIS AFTER
import java.util.Scanner;

public class TetrisView{
	private Board board;
	private UserAction action;

	public TetrisView(Board b){
		board = b.clone();
		action = UserAction.INVALID;
	}

	public void setBoard(Board b){
		board = b.clone();
		action = UserAction.INVALID;
	}

	public void setAction(UserAction a){
		action = a;
	}

	public void updateDisplay(Block b, int score, int level, int rowsCleared){
		
		Tile[][] tempBoard = new Tile[board.getBoard().length][board.getBoard()[0].length];
		for(int i = 0; i<board.getBoard().length; i++){
			for(int j = 0; j<board.getBoard()[0].length; j++){
				tempBoard[i][j] = new Tile(board.getBoard()[i][j].getValue());
			}
		}
		
		board.getBoard().clone();
		
		
		for(int i = b.getShape().length-1; i>=0; i--){
			for(int j = 0; j<b.getShape()[i].length; j++){
				if(b.getShape()[i][j]==1){
					tempBoard[b.getY()+i][b.getX()+j].setValue(1);
				}
			}
		}
		System.out.println(new Board(board.getWidth(), board.getHeight(), tempBoard).toString());
		System.out.println("Score: " + score + "\t\tLevel: " + level + "\t\tRows Cleared: " + rowsCleared);
		
	}

	//Gets the KeyBoard Event and returns the correct enum value
	public UserAction getUserAction(){		
		System.out.println("Enter command('W', 'A', 'S', 'D', ' '): ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		input = input.toUpperCase();
		switch(input){		
		case "W":
			return UserAction.UP;

		case "A":
			return UserAction.LEFT;

		case "D":
			return UserAction.RIGHT;

		case "S":
			return UserAction.DOWN;

		case " ":
			return UserAction.JUMP;
		}
		return action;
	}



}
