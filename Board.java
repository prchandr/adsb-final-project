package net.mrpaul.ads.QM020.tetris;

import java.util.Arrays;

public class Board {
	private Tile[][] board;
	private int width;
	private int height;

	public Board(){
		width = 10;
		height = 20;
		board = new Tile[height+5][width];
		for(Tile[] tArray: board){
			Arrays.fill(tArray, new Tile());
		}
	}

	public Board(int w, int h){
		if(w<10&&h<100&&w>5&&h>10){
			width = w;
			height = h;
			board = new Tile[h+5][w];
		}
		for(Tile[] tArray: board){
			Arrays.fill(tArray, new Tile());
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
}
