import java.util.Scanner;

public class TetrisView{
	private Board board;
	
	public TetrisView(Board b){
		board = b;
	}
	
	public void setBoard(Board b){
		board = b;
	}
	
	public String getUserAction(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter whatever: ");
		String response = reader.next();
		return response;
	}
	
}