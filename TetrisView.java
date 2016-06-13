package net.mrpaul.ads.QM020.tetris;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

import java.util.ArrayList;
//DELETE THIS AFTER

public class TetrisView{
	private Board board;
	private ArrayList<Block> blockList = new ArrayList<Block>();
	
	public TetrisView(Board b){
		board = b;
	}

	public void setBoard(Board b){
		board = b;
	}

	//Gets the KeyBoard Event and returns the correct enum value
	public UserAction getUserAction(){
		/*
		REPLACE THIS WITH JAVAFX AND KEYBOARD EVENTS LATER ON
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("Enter [W]Up, [A]Left, [S]Down, [D]Right, [ESC]Quit: ");
		String result = in.nextLine();


		switch(result){
		case "W":
			return UserAction.UP;
		case "A":
			return UserAction.LEFT;
		case "S":
			return UserAction.DOWN;
		case "D":
			return UserAction.RIGHT;
		default:
			return UserAction.INVALID;
		}
	}

	public void updateDisplay(ArrayList<Block> bList){
		/*
		REPLACE THIS WITH JAVAFX AND KEYBOARD EVENTS LATER ON
		we can use TilePane to get a visual representation of the board
		 */
		
		blockList = bList;
		
		System.out.println(board.toString());	
	}


	
}
