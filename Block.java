public class Block {
	private int x;     
	private int y;
	private int[][] shape;
	private Board board;
	private boolean isFalling = false;
	
	//initializes a Block with x and y coordinates at the top of it 
	//when the board is completely filled, this x and y coordinate will tell if there's no more space at the top to add new blocks
	//this ends the game
	public Block(int[][] s, Board b){
		x = b.getWidth()/2;
		y = b.getHeight()+1;
		board = b;
		shape = s;
	}
	
	//self-explanatory :/
	public void startFalling(){
		isFalling = true;
	}
	
	//y-coordinate changes as the block moves down the board.
	public void moveDown() {
		if(isFalling){
			y-=1;
		}
	}
	
	//x-coordinate also changes if the left key is pressed.			
	public void moveLeft() {
		if(x>0){
			x-=1;
		}
	}
	
	//same goes for pressing the right key
	public void moveRight() {
		if(x<board.getWidth()-1){
			x+=1;
		}
	}
	
	//pressing the up or down key should trigger this, which creates a new array with values shifted to match the 90 degree turn
	public void rotate() {
		int[][] newShape = new int[shape[0].length][shape.length];
		for(int i=0; i<arr[0].length; i++){
        		for(int j=arr.length-1; j>=0; j--){
        			 newShape[i][j] = shape[j][i];
        		}
		}
		shape = newShape;
       }
	
	//if the block hits the bottom of the board or the closest value to it, it needs to stop. 
	//if it does, the next block is launched and the values where the block was placed are set to full permanently. 
	public Board stop(){
		isFalling = false;
		for(int i = 0; i<shape.length; i++){
			for(int j = 0; j<shape[i].length; j++){
				if(i==1){
					board[x+j][y+x].setValue(1);
				}
			}
		}
		return board;
	}
}
