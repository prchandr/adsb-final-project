package net.mrpaul.ads.QM200.may;

public class BlockFactory{
  
  //5 Piece Shapes
  
  //Several of the shapes form serpentine or S/Z shapes
  //when one of these rotates, it becomes one of the others
  //might be worth looking into in the block turning methods.
  
	public static void main(String[] args){
	}
	
  public static final int[][] S1 = 
    {{0, 1, 1, 1},
     {1, 1, 0, 0}};  
     
  public static final int[][] S2 =
    {{1, 1, 1, 0},
     {0, 0, 1, 1}};
  
  //Idk if these are symmetrical
  
  public static final int[][] Z1 = 
    {{1, 0, 0},
     {1, 1, 1},
     {0, 0, 1}};
     
  public static final int[][] Z2 = 
    {{0, 0, 1},
     {1, 1, 1},
     {1, 0, 0}};   
     
  public static final int[][] W =
    {{0, 0, 1},
     {0, 1, 1},
     {1, 1, 0}};
     
  public static final int[][] R1 = 
    {{1, 1, 1},
     {1, 0, 0},
     {1, 0, 0}};
     
  public static final int[][] R2 = 
    {{0, 1, 1},
     {1, 1, 0},
     {0, 1, 0}};
  
  public static final int[][] R3 = 
    {{1, 1, 0},
     {0, 1, 1},
     {0, 1, 0}};
     
  public static final int[][] PLUS = 
    {{0, 1, 0},
     {1, 1 ,1},
     {0, 1, 0}};
     
  public static final int[][] C = 
    {{1, 1, 1},
     {1, 0, 1}};
     
  public static final int[][] L1 = 
    {{1, 1, 1, 1},
     {0, 0, 0, 1}};
     
  public static final int[][] L2 =
    {{1, 1, 1, 1},
     {1, 0, 0 ,0}};
     
  public static final int[][] T1 = 
    {{1, 0, 0},
     {1, 1, 1}, 
     {1, 0, 0}};
     
  public static final int[][] T2 = 
    {{1, 1, 1, 1},
     {0, 0, 1, 0}};
     
  public static final int[][] T3 = 
    {{1, 1, 1, 1},
     {0, 1, 0, 0}};
     
  public static final int[][] BAR = 
    {{1, 1, 1, 1, 1}};
    
  public static final int[][] TRAP1 = 
    {{1, 0},
     {1, 1},
     {1, 1}};
     
  public static final int[][] TRAP2 = 
    {{0, 1},
     {1, 1},
     {1, 1}};
  
  //4 Piece Shapes
  public static final int[][] L1_4 =
		{{1,1},
		 {0,1},
		 {0,1}
		};
		
	public static final int[][] L2_4 =
		{{0,1},
		 {0,1},
		 {1,1}
		};		
		
	public static final int[][] T_4 =
		{{0,1},
		 {1,1},
		 {0,1}
		};
		
	public static final int[][] BOX =
		{{1,1},
		 {1,1}
		};
		
	public static final int[][] BAR_4 =
		{{1,1,1,1}
		};		
		
	public static final int[][] STEP1 =
		{{1,0},
		 {1,1},
		 {0,1}
		};	
		
	public static final int[][] STEP2 =
		{{0,1},
		 {1,1},
		 {1,0}
		};
  
  public static final int[][][] PENTRIS = {S1, S2, W, R1, R2, R3, PLUS, C, L1, L2, Z1, Z2, T1, T2, T3, BAR, TRAP1, TRAP2};
  public static final int[][][] TETRIS = {L1_4, L2_4, T_4, BOX, BAR_4, STEP1, STEP2};
  
  public static Block createPentrisBlock(Board b){
    int[][] newBlock = PENTRIS[(int)(Math.random()*PENTRIS.length)];
    return new Block(newBlock, b);
  }
  
  public static Block createTetrisBlock(Board b){
    int[][] newBlock = PENTRIS[(int)(Math.random()*PENTRIS.length)];
    return new Block(newBlock, b);
  }
}
