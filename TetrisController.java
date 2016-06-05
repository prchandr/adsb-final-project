/*
Keeps the game running. 
*/
import javafx.animation.AnimationTimer;

public class TetrisController{
  private Board board;
  private TetrisView view;
  private int score;
  private int rowsCleared;
  private int level;
  private ArrayList<Block> blockList;
  private int numBlocks;
  private int fallSpeed;
  
  public TetrisController(){
    board = new Board();
    tw = new TetrisView();
  }
  
  public TetrisController(Board b, TetrisView tw){
    board = b;
    view = tw;
  }
  
  public Block[] getBlockList(){
    return blockList;
  }
  
  public int getScore(){
    return score;
  }
  
  
  public void runGame(){
    final long startTime = System.nanoTime();
    int ticks = 0;
    score = 0;
    rowsCleared = 0;
    level = 1;
    blockList = new ArrayList<Block>();
    numBlocks = 4;
    fallSpeed = 500;
    
    
    if(board.canPlay()){
       new AnimationTimer(){
         public void handle(long currentTime){
           //Gets action from viewer
           UserAction action = tw.getUserAction();
           
           //Updates the number of blocks visible to the player
           numBlocks = 4-level/5;
           if(numBlocks<1){
             numBlocks = 1;
           }
           
           for(int i = blockList.size(); i<numBlocks; i++){
             blockList.add(BlockFactory.createPentrisBlock(board));
           }
           Block mainBlock = blockList.get(0);
           
           //Sees if mainblock is finished falling then stops falling. Removes block from blockList and updates board with new board
           
           
           
           //Determines if block is going down
           if(ticks%fallSpeed==0||action==DOWN){
             mainBlock.moveDown();
             
             //If the player wants to get down
             if(action==DOWN){
               score+=1;
             }
           }
           
           //Checks if any row has been cleared and changes score, level, and rowsCleared appropriately
           int tempRows = rowsCleared;
           boolean fullRow;
           for(int i = 0; i<height; i++){
              fullRow = true;
              for(Tile t: board[i]){
                if(t.isEmpty()){
                  fullRow = false;
                }
              }
              tempRows = rowsCleared;
              if(fullRow){
                score+=100;
                rowsCleared++;
                fallSpeed-=10;
                if(fallSpeed<50){
                  fallSpeed = 50;
                }
                for(int j = i; j<height; j++){
                  board[j] = board[j+1].clone();
                }
                i--;
              }
              if(rowsCleared%10==0&&tempRows!=rowsCleared){
                level++;
              }
           }
           //Controls the actions
            switch action{
              case UP:
                mainBlock.rotate();
                break; 
              case LEFT:
                mainBlock.moveLeft();
                break;
              case RIGHT:
                mainBlock.moveRight();
                break;
              case default:
                break;
           }
           
           ticks++;
         }
       }.start();
    }
  }
}
