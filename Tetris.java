package net.mrpaul.ads.QM200.may;

public class Tetris{
  private static Board board = new Board();
  private static TetrisView view = new TetrisView(board);
  private static TetrisController controller = new TetrisController(board, view);
  
  public static void main(String[] args){
    controller.runGame();
  }
}
