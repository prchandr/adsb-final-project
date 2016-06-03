//it's a tile class that works
public class Tile{
	private int x;
	
	public Tile(){
	   x = 0;
	}
	
	public Tile(int num){
	   x = num;
	}
	
	public boolean isEmpty(){
	   if(x == 0){
	      return true;
	   }
	return false;
	}
	
	public int getValue(){
	   return x;
	}
	
	public void setValue(int num){
	   x = num;
	}
	
	public String toString(){
	   return x+"";
	}
	
	public Tile clone(){
	   Tile clone = new Tile(x);
	   return clone;
	}	
}
