/*
Keeps the game running. 
*/
import javafx.animation.AnimationTimer;


public class TetrisController extends Application{
  private Board board;
  private TetrisView view;
  private long time;
  
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
    
    if(board.canPlay()){
       new AnimationTimer(){
         public void handle(long currentTime){
           if(ticks%500==0||tw.getUserAction()==DOWN){
             //Move block down because of gravity
           }
           boolean fullRow;
           for(int i = 0; i<height; i++){
              fullRow = true;
              for(Tile t: board[i]){
                if(t.isEmpty()){
                  fullRow = false;
                }
              }
              if(fullRow){
                for(int j = i; j<height; j++){
                  board[j] = board[j+1].clone();
                }
                i--;
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
