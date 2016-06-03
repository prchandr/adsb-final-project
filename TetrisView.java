import java.util.Scanner;

public class TetrisView{
	private Board board;
	
	public TetrisView(Board b){
		board = b;
	}
	
	public void setBoard(Board b){
		board = b;
	}
	
	//Gets the KeyBoard Event and returns the correct enum value
	public UserAction getUserAction(){
		/*
		REPLACE THIS WITH JAVAFX AND KEYBOARD EVENTS LATER ON
		*/
		Scanner in = new Scanner();
		System.out.print("Enter [W]Up, [A]Left, [S]Down, [D]Right, [ESC]Quit: ")
		String result = in.nextLine();
		
		switch result{
			case "W":
				return UP;
			case "A":
				return LEFT;
			case "S":
				return DOWN;
			case "D":
				return RIGHT;
			case default:
				return INVALID;
		}
	}
	
	public void updateDisplay(){
		/*
		REPLACE THIS WITH JAVAFX AND KEYBOARD EVENTS LATER ON
		*/
		System.out.println(board.toString());	
	}
}
