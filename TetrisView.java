
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.ArrayList;
//DELETE THIS AFTER
import java.util.Scanner;

public class TetrisView extends Application{
	private Board board;
	private BlockFactory bf;
	private Block[][] blockList = new Block[][]{};

	
	public TetrisView(Board b){
		board = b;
	}
	
	public void setBoard(Board b){
		board = b;
	}
	
	public enum UserAction {
		UP, LEFT, RIGHT, DOWN, RESET, PAUSE, EXIT, INVALID
	}
	
	//Gets the KeyBoard Event and returns the correct enum value
	public UserAction getUserAction(){
		/*
		REPLACE THIS WITH JAVAFX AND KEYBOARD EVENTS LATER ON
		*/
		Scanner in = new Scanner(System.in);
		System.out.print("Enter [W]Up, [A]Left, [S]Down, [D]Right, [ESC]Quit: ");
		String result = in.nextLine();
		UserAction action = UserAction.INVALID;
		
		switch(result){
			case "W":
				return UserAction.UP;
			case "A":
				return UserAction.LEFT;
			case "S":
				return UserAction.DOWN;
			case "D":
				return UserAction.RIGHT;
			default:
				return UserAction.INVALID;
		}
	}
	
	public void updateDisplay(){
		/*
		REPLACE THIS WITH JAVAFX AND KEYBOARD EVENTS LATER ON
		we can use TilePane to get a visual representation of the board
		*/
		System.out.println(board.toString());	
	}
	
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Pentris!");
		primaryStage.setMinWidth(200);
		primaryStage.setMinHeight(400);
		Scanner s = new Scanner(System.in);
		System.out.println("Board Width?");
		int width = Integer.parseInt(s.next());
		System.out.println("Board Length?");
		int length = Integer.parseInt(s.next());
		TilePane tile = new TilePane(Orientation.VERTICAL);
    		tile.setTileAlignment(Pos.CENTER_LEFT);
    		if(width > 0 && width < 100){
    		tile.setPrefRows(width);}
    		if(length > 0 && length < 100){
    		tile.setPrefColumns(length);}  		
		primaryStage.show();
	}
	
	
	public static void main(String[] args){
		launch(args);
	}

}
