public class TetrisView extends Application{
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
	
}