package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
public class newMedicalProfessionalController {


 @FXML private TextField txtName;
 @FXML private Button addButton;

 public void addNewMedicalProfessional(){

	 String name = txtName.getText();
	 System.out.println(name);

 }


}
