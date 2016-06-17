package net.mrpaul.ads.QM020.tetris;

public class Tile{
	private int value;
	
	public Tile(){
	   value = -1;
	}
	
	public Tile(int num){
	   value = num;
	}
	
	public boolean isEmpty(){
	   if(value == -1){
	      return true;
	   }
	   return false;
	}
	
	public int getValue(){
	   return value;
	}
	
	public void setValue(int num){
	   value = num;
	}
	
	public String toString(){
	   if(value==-1){
	   	return "_";
	   }
	   return ""+value;
	}
	
	public Tile clone(){
	   Tile clone = new Tile(value);
	   return clone;
	}	
}
