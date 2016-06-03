package net.mrpaul.ads.QM020.tetris;

public class Board {
	private Tile[][] board;
	private int width = 10;
	private int height = 20;

	public Board(){
		width = 10;
		height = 20;
		board = new Tile[height+1][width];
	}

	public Board(int w, int h){
		if(w<10&&h<100&&w>5&&h>10){
			width = w;
			height = h;
			board = new Tile[w][h];
		}
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public Tile[][] getBoard(){
		return board;
	}

	public String toString(){
		String output = "";
		for(Tile[] tileArray: board){
			for(Tile t: tileArray){
				output+=t.toString() + "\t";
			}
			output += "\n";
		}
		return output;
	}
	
	public boolean canPlay(){
		for(Tile t: board[height+1]){
			if(!t.isEmpty()){
				return false;
			}
		}
		return true;
	}
}
