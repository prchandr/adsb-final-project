public class Block {
	private int x;     
	private int y;
	private int[][] shape;
	private Board board;
	private Color color;
	private boolean isFalling = false;
	
	public Board(int[][] s, Board b, Color c){
		x = b.getWidth()/2;
		y = b.getHeight()+1;
		board = b;
		shape = s;
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
		for(int[] row: shape){
			for(int i: row){
				//Place each tile in the block on the board
			}
		}
	}
}
