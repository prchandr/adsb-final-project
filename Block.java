public class Block {
	private int x;     
	private int y;
	private Board board;
	private Color color;
	
	public Piece(int shape[][], Board b){
		x = b.getWidth()/2;
		y = b.getHeight()+1;
		board = b;
		updateLocation();
	}
	
	public void updateLocation() {
		setLocation(Tetris.SQUARE_SIZE*currentX,
					(int) (Tetris.SQUARE_SIZE*currentY));
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
		if(x<)
	}
	
	public void rotateClockwise() {
	}
	
	public void rotateCounterclockwise() {
	}
	
	public void stop(){
		
	}
}
