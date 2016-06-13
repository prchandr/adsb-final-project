package net.mrpaul.ads.QM020.tetris;

/*


Keeps the game running. 
 */
import java.util.ArrayList;
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
	private int ticks;

	public TetrisController(){
		board = new Board();
		view = new TetrisView(board);
	}

	public TetrisController(Board b, TetrisView tw){
		board = b;
		view = tw;
	}

	public ArrayList<Block> getBlockList(){
		return blockList;
	}

	public int getScore(){
		return score;
	}


	public void runGame(){
		final long startTime = System.nanoTime();
		ticks = 0;
		score = 0;
		rowsCleared = 0;
		level = 1;
		blockList = new ArrayList<Block>();
		numBlocks = 4;
		fallSpeed = 500;


		while(board.canPlay()){
			//Gets action from viewer
			UserAction action = view.getUserAction();

			//Updates the number of blocks visible to the player
			numBlocks = 4-level/5;
			if(numBlocks<1){
				numBlocks = 1;
			}

			for(int i = blockList.size(); i<numBlocks; i++){
				blockList.add(BlockFactory.createPentrisBlock(board));
			}
			Block mainBlock = blockList.get(0);




			//Determines if block is going down
			if(ticks%fallSpeed==0){
				//Sees if mainblock is finished falling then stops falling. Removes block from blockList and updates board with new board
				if(mainBlock.isColliding(board)){
					board = mainBlock.stop(board);
					blockList.remove(0);
					blockList.get(0).startFalling();
				}
				mainBlock.moveDown();
			}

			//Checks if any row has been cleared and changes score, level, and rowsCleared appropriately
			int tempRows = rowsCleared;
			boolean fullRow;
			for(int i = 0; i<board.getHeight(); i++){
				fullRow = true;
				for(Tile t: board.getBoard()[i]){
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
					for(int j = i; j<board.getHeight(); j++){
						board.getBoard()[j] = board.getBoard()[j+1].clone();
					}
					i--;
				}
				if(rowsCleared%10==0&&tempRows!=rowsCleared){
					level++;
				}
			}
			//Controls the actions
			switch(action){
			case UP:
				mainBlock.rotate();
				break; 
			case LEFT:
				mainBlock.moveLeft(board);
				break;
			case RIGHT:
				mainBlock.moveRight(board);
				break;

			case DOWN:
				mainBlock.moveDown();
				score+=1;
				break;
			default:
				break;
			}

			view.updateDisplay(blockList);
			ticks++;
		}

	}
}
