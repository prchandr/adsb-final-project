package net.mrpaul.ads.QM020.tetris;

/*


Keeps the game running. 
 */

import java.util.Arrays;

public class TetrisController{
	private Board board;
	private TetrisView view;
	private int score;
	private int rowsCleared;
	private int level;
	private Block mainBlock;
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

	public Block getBlock(){
		return mainBlock;
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
		mainBlock = BlockFactory.createPentrisBlock(board);
		mainBlock.startFalling();
		numBlocks = 4;
		fallSpeed = 2;

		while(board.canPlay()){
			UserAction action;
			
			action = view.getUserAction();
			
			
			//Updates the number of blocks visible to the player
			numBlocks = 4-level/5;
			if(numBlocks<1){
				numBlocks = 1;
			}

			if(!mainBlock.isFalling()){
				mainBlock = BlockFactory.createPentrisBlock(board);
				mainBlock.startFalling();	
			}
			

			//Determines if block is going down
			if(ticks%fallSpeed==0){
				//Sees if mainblock is finished falling then stops falling. Removes block from blockList and updates board with new board
				if(mainBlock.isColliding(board)){
					board = mainBlock.stop(board);
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
					for(int j = i; j<board.getHeight(); j++){
						board.getBoard()[j]=Arrays.copyOf(board.getBoard()[j+1], board.getWidth());
					}
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
				
			case JUMP:
				int tempScore = 0;
				while(!mainBlock.isColliding(board)){
					mainBlock.moveDown();
					tempScore++;
				}
				score+=tempScore;
				break;
				
			default:
				break;
			}
			ticks++;
			view.updateDisplay(mainBlock, score, level, rowsCleared);
			//Gets action from viewer
			
		}
		
		//GAME OVER
		System.out.println("GAME OVER!!!!!");

	}
}
