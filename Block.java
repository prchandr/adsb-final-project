public class Block {
	private int x;     
	private int y;
	private int[][] shape;
	private Board board;
	private Color color;
	private boolean isFalling;
	
	public Piece(int[][] s, Board b, Color c){
		x = b.getWidth()/2;
		y = b.getHeight()+1;
		board = b;
		shape = s;
		updateLocation();
	}
	
	public void updateLocation() {
		isFalling = true;
		
	}
	
	public void moveDown() {
		y-=1;
	}
				
	public void moveLeft() {
		if(x>0){
			x-=1;
		}
	}
	
	public void moveRight() {
		if(x<board.getWidth()-1){
			x+=1;
		}
	}
	
	public void rotate() {
		
	}
	
	public Board stop(){
		isFalling = false;
		for(int[] row: shape){
			for(int i: row){
				//Place each tile in the block on the board
			}
		}
		
	}
}
