
import java.util.Random;

public class block{
	private Random rng = new Random();
	private Tile blank = new Tile();
	private Tile tile = new Tile(1);
	public static void main(String[] args) {
		Tile t = new Tile();
	}
	
	public block(){
		int randomNumber = rng.nextInt(19)+1;
		Tile[][] Block;
		 if(randomNumber == 1){
			Block = block1();
		}else if(randomNumber == 2){
			Block = block2();
		}else if(randomNumber == 3){
			Block = block3();
		}else if(randomNumber == 4){
			Block = block4();
		}else if(randomNumber == 5){
			Block = block5();
		}else if(randomNumber == 6){
			Block = block6();
		}else if(randomNumber == 7){
			Block = block7();
		}else if(randomNumber == 8){
			Block = block8();
		}else if(randomNumber == 9){
			Block = block9();
		}else if(randomNumber == 10){
			Block = block10();
		}else if(randomNumber == 11){
			Block = block11();
		}else if(randomNumber == 12){
			Block = block12();
		}else if(randomNumber == 13){
			Block = block13();
		}else if(randomNumber == 14){
			Block = block14();
		}else if(randomNumber == 15){
			Block = block15();
		}else if(randomNumber == 16){
			Block = block16();
		}else if(randomNumber == 17){
			Block = block17();
		}else if(randomNumber == 18){
			Block = block18();
		}
	}
	/**
	--***
	-**--
	-----
	-----
	-----
	*/
	public Tile[][] block1(){
		Tile[][] block1 = new Tile[][]{
			{blank, blank, tile, tile,tile},
			{blank, tile, tile, blank, blank},
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, blank}
			};
		return block1;
		
	}
	
	public Tile[][] block2(){
		
	}
	public Tile[][] block3(){
		
	}
	public Tile[][] block4(){
		
	}
	public Tile[][] block5(){
		
	}
	public Tile[][] block6(){
		
	}
	public Tile[][] block7(){
		
	}
	public Tile[][] block8(){

	}
	public Tile[][] block9(){

	}
	public Tile[][] block10(){

	}
	public Tile[][] block11(){

	}
	public Tile[][] block12(){

	}
	public Tile[][] block13(){

	}
	public Tile[][] block14(){

	}
	public Tile[][] block15(){

	}
	public Tile[][] block16(){

	}
	public Tile[][] block17(){

	}
	public Tile[][] block18(){

	}

}
