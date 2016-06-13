package net.mrpaul.ads.QM020.tetris;

public class Block {
	private int x;     
	private int y;
	private int[][] shape;
	private boolean isFalling = false;

	public Block(int[][] s, Board b){
		x = b.getWidth()/2;
		y = b.getHeight()+1;
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

	public void moveLeft(Board board) {
		if(x>0){
			x-=1;
		}
	}

	public void moveRight(Board board) {
		if(x<board.getWidth()-1){
			x+=1;
		}
	}

	public void rotate() {
		int[][] newShape = new int[shape[0].length][shape.length];
		for(int i=0; i<shape[0].length; i++){
			for(int j=shape.length-1; j>=0; j--){
				newShape[i][shape.length-1-j] = shape[j][i];
			}
		}


		shape = newShape;
	}

	public boolean isColliding(Board b){
		for(int i = 0; i<shape.length; i++){
			for(int j = 0; j<shape[0].length; j++){
				if(y+i<=0){
					return true;
				}
				if(shape[i][j]==1){
					if(!b.getTile(x+j, y+i-1).isEmpty()){
						return true;
					}
				}
			}
		}
		return false;
	}


	public Board stop(Board b){
		isFalling = false;
		for(int i = 0; i<shape.length; i++){
			for(int j = 0; j<shape[i].length; j++){
				if(shape[i][j]==1){
					b.getBoard()[y+i][x+j].setValue(1);
				}
			}
		}
		return b;
	}

	public boolean canRotate(Board b) {
		for(int i = 0; i < shape[0].length; i++){
			for(int j = shape.length-1; j >= 0; j--){
				if(b.getBoard()[i][j].isEmpty()==false){
					return false;
				}
			}
		}
		return true;
	}


	public String toString(){
		String result = "";
		for(int[] i: shape){
			for(int j: i){
				if(j==1){
					result+= "1" + "\t";
				}
				else{
					result+= " " + "\t";
				}
			}
			result+="\n";
		}
		return result;
	}
}
