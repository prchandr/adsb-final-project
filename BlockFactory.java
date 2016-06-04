public class BlockFactory{
  //5 Piece Shapes
  public static final int[][] S1 = 
    {{0, 1, 1, 1},
     {1, 1, 0, 0}};
     
  
  public static final int[][] S2 =
    {{1, 1, 1, 0},
     {0, 0, 1, 1}};
     
  public static final int[][] W =
    {{0, 0, 1},
     {0, 1, 1},
     {1, 1, 0}};
     
  public static final int[][] R1 = 
    {{1, 1, 1}
     {1, 0, 0}
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
     
  public static final int[][] Z1 = 
    {{1, 0, 0},
     {1, 1, 1},
     {0, 0, 1}};
     
  public static final int[][] Z2 = 
    {{0, 0, 1},
     {1, 1, 1},
     {1, 0, 0}};
     
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
    
    //INSERT A RANDOM THING TO CHANGE ORIENTATION
    
    return new Block(newBlock, board);
  }
  
  public static Block createTetrisBlock(Board b){
    int[][] newBlock = PENTRIS[(int)(Math.random()*PENTRIS.length)];
    
    //INSERT A RANDOM THING TO CHANGE ORIENTATION
    
    return new Block(newBlock, b);
  }
}
