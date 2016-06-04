/*
Keeps the game running. 
*/
import javafx.animation.AnimationTimer;


public class TetrisController{
  private Board board;
  private TetrisView view;
  private long time;
  private int score;
  private int rowsCleared;
  private int level;
  
  public TetrisController(){
    board = new Board();
    tw = new TetrisView();
  }
  
  public TetrisController(Board b, TetrisView tw){
    board = b;
    view = tw;
  }
  
  public boolean isFinalPosition(Block b){
    for(int i = 0; i < 5; i++){
      if((b[i][4].isEmpty() == false){
        if(board[b.getColumn(not implemented)][b.getRow(not implemented)+1].isEmpty==false){
          return true;  
        } 
      }
    }
    return false;   
  }
  
  public void runGame(){
    final long startTime = System.nanoTime();
    int ticks = 0;
    score = 0;
    rowsCleared = 0;
    level = 1;
    
    if(board.canPlay()){
       new AnimationTimer(){
         public void handle(long currentTime){
           UserAction action = tw.getUserAction();
           if(ticks%500==0||action==DOWN){
             //Move block down one height because of gravity
             if(action==DOWN){
               score+=1;
             }
           }
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
                for(int j = i; j<height; j++){
                  board[j] = board[j+1].clone();
                }
                i--;
              }
              if(rowsCleared%10==0&&tempRows!=rowsCleared){
                level++;
              }
           }
           
           switch tw.getUserAction(){
             //Add cases here. Not sure how to move blocks with this though.
           }
           
           ticks++;
         }
       }.start();
    }
  }
}
