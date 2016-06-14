package net.mrpaul.ads.QM200.may;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View extends Application{
	public void start(Stage primaryStage) throws IOException{
		Stage window = new Stage();
		window = primaryStage;
		window.setTitle("Tetris");
	
		
		VBox vbox = new VBox();
		
        Scene scene = new Scene(vbox, 790, 500);
        scene.getStylesheets().add("p3/MattStar.css");
        window.setScene(scene);
        window.show();
	}
	
	public static void main(String[] args){
	}

	
}
