public class Block {
	private int x;     
	private int y;
	private int[][] shape;
	private Board board;
	private boolean isFalling = false;
	
	public Block(int[][] s, Board b){
		x = b.getWidth()/2;
		y = b.getHeight()+1;
		board = b;
		shape = s;
	}
	
	public void startFalling(){
		isFalling = true;
	}
	
	public void moveDown() {
		if(isFalling){
			y-=1;
		}
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
		int[][] newShape = new int[shape[0].length][shape.length];
		for(int i=0; i<arr[0].length; i++){
        		for(int j=arr.length-1; j>=0; j--){
        			 newShape[i][j] = shape[j][i];
        		}
		}
		shape = newShape;
       }
	
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
