/*
Keeps the game running. 
*/
public class TetrisController extends Application{
  private Board board;
  private TetrisView view;
  
  public TetrisController(){
    board = new Board();
    tw = new TetrisView();
  }
  
  public TetrisController(Board b, TetrisView tw){
    board = b;
    view = tw;
  }
  
  public void runGame(){
    
  }
}
