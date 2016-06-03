/*
Keeps the game running. 
*/
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
  } } }
  return false;   
  }
  
  public void runGame(Block b){
  time = System.nanoTime();
  while(System.nanoTime()-time < 500000000)
  //code
  }
  if(b.isFinalPosition()){
  runGame(new Block();)  
  }
  else{
  runGame(b);
  }
  }
}
