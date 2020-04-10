package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MenuController {


	public void addPatient(ActionEvent event) throws IOException{

		Parent addPatientRoot = FXMLLoader.load(getClass().getResource("newPatient.fxml"));

		Scene newPatientScene = new Scene(addPatientRoot);

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		window.setScene(newPatientScene);
		window.show();

	}

}
