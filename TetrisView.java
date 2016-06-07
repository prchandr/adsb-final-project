import javafx.application.Application;

//DELETE THIS AFTER
import java.util.Scanner;

public class TetrisView extends Application{
	private Board board;
	private BlockFactory bf;
	private ArrayList<Block> blockList = new ArrayList<Block>();
	
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
			default:
				return INVALID;
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
		
		TilePane tile = new TilePane(Orientation.VERTICAL);
    		tile.setTileAlignment(Pos.CENTER_LEFT);
    		if(user's input > 0 && user's input < 100){
    		tile.setPrefRows(user's input);
    		tile.setPrefColumns(user's input);
		for (int i = 0; i < 50; i++) {
        	tile.getChildren().add(our blocks);}]
    }
		
		
		
		primaryStage.show();
	}
	
	
	public static void main(String[] args){
		launch(args);
	}
}
