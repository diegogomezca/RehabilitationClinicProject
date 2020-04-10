package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.*;


public class Main extends Application {

	Stage stage;

	@Override
	public void start(Stage stage) {
		try {
			//BorderPane root = new BorderPane();
		//	Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();

		Parent menuSceneRoot = FXMLLoader.load(getClass().getResource("newPatient.fxml"));
		Scene newMenu = new Scene(menuSceneRoot);

		stage.setScene(newMenu);
		stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public  Stage getStage(){
		return stage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
