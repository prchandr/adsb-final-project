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
		Scanner s = new Scanner(System.in);
		System.out.println("Board Width?");
		int width = Scanner.next();
		System.out.println("Board Length?");
		int length = Scanner.next();
		TilePane tile = new TilePane(Orientation.VERTICAL);
    		tile.setTileAlignment(Pos.CENTER_LEFT);
    		if(width > 0 && width < 100){
    		tile.setPrefRows(width);}
    		if(length > 0 && length < 100){
    		tile.setPrefColumns(length);}
		for (int i = 0; i < 50; i++) {
        	tile.getChildren().add(bf);}
    }
		
		
		
		primaryStage.show();
	}
	
	
	public static void main(String[] args){
		launch(args);
	}
}
