public class Tetris{
  private Board board = new Board();
  private TetrisView view = new TetrisView(board);
  private TetrisController controller = new TetrisController(board, view);;
  
  public static void main(String[] args){
    controller.runGame();
  }
}
