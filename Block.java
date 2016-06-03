
import java.util.Random;

public class Block{
	private Random rng = new Random();
	private Tile blank = new Tile();
	private Tile tile = new Tile(1);
	public static void main(String[] args) {
		Tile t = new Tile();
	}
	
	public block(){
		int randomNumber = rng.nextInt(19)+1;
		Tile[][] block;
		 if(randomNumber == 1){
			block = block1();
		}else if(randomNumber == 2){
			block = block2();
		}else if(randomNumber == 3){
			block = block3();
		}else if(randomNumber == 4){
			block = block4();
		}else if(randomNumber == 5){
			block = block5();
		}else if(randomNumber == 6){
			block = block6();
		}else if(randomNumber == 7){
			block = block7();
		}else if(randomNumber == 8){
			block = block8();
		}else if(randomNumber == 9){
			block = block9();
		}else if(randomNumber == 10){
			block = block10();
		}else if(randomNumber == 11){
			block = block11();
		}else if(randomNumber == 12){
			block = block12();
		}else if(randomNumber == 13){
			block = block13();
		}else if(randomNumber == 14){
			block = block14();
		}else if(randomNumber == 15){
			block = block15();
		}else if(randomNumber == 16){
			block = block16();
		}else if(randomNumber == 17){
			block = block17();
		}else if(randomNumber == 18){
			block = block18();
		}
	}
	/**
	-----
	-----
	-----
	--***
	-**--
	*/
	public Tile[][] block1(){
		Tile[][] block1 = new Tile[][]{
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, blank},
			{blank, blank, tile, tile, tile},
			{blank, tile, tile, blank, blank}
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
	Tile[][] block17 = new Tile[][]{
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, blank},
			{blank, tile, tile, tile, tile},
			{blank, blank, tile, blank, blank}
			};
		return block17;
	}
	public Tile[][] block18(){
	Tile[][] block18 = new Tile[][]{
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, blank},
			{blank, blank, blank, blank, tile},
			{blank, blank, blank, tile, tile},
			{blank, blank, blank, tile, tile}
			};
		return block18;
	}

}
