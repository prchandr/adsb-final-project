package net.mrpaul.ads.QM020.tetris;


public class Board {
	private Tile[][] board;
	private int width;
	private int height;

	public Board(){
		width = 10;
		height = 20;
		board = new Tile[height+5][width];
		for(int i = 0; i<board.length; i++){
			for(int j = 0; j<board[0].length; j++){
				board[i][j] = new Tile();
			}
		}
	}

	public Board(int w, int h){
		if(w<10&&h<100&&w>5&&h>10){
			width = w;
			height = h;
			board = new Tile[h+5][w];
		}
		for(int i = 0; i<board.length; i++){
			for(int j = 0; j<board[0].length; j++){
				board[i][j] = new Tile();
			}
		}
	}

	public Board(int w, int h, Tile[][] b){
		board = b;
		height = h;
		width = w;
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
		for(int i = board.length-5; i>=0; i--){
			for(int j = 0; j<board[0].length; j++){
				output+=board[i][j].toString() + "\t";
			}
			output+="\n";
		}

		return output;
	}

	public boolean canPlay(){
		for(Tile t: board[height]){
			if(!t.isEmpty()){
				return false;
			}
		}

		return true;
	}

	public Tile getTile(int x, int y){
		return board[y][x];
	}

	public Board clone(){
		return new Board(width, height, board);
	}
}
