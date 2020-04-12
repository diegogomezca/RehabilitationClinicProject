package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class SceneChanger {


	public void changeScenes(ActionEvent event, String viewName, String title)
	{

		/*FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(viewName));
		Parent parent = loader.load();

		Scene scene = new Scene(parent);

		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();*/
		System.out.print("adios");
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(viewName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object eventSource = event.getSource();
		Node sourceAsNode = (Node) eventSource ;
		Scene oldScene = sourceAsNode.getScene();
		Window window = oldScene.getWindow();
		Stage stage = (Stage) window ;
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
