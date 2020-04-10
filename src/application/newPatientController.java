package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import pojos.Pacient;

import db.interfaces.*;
import db.sqlite.SQLiteManager;

public class newPatientController{

@FXML private TextField txtName, txtNif, txtPhoneNumber, txtAdress, txtEmail;
@FXML private ChoiceBox<String> sexChoiceBox;

ObservableList<String> sexList = FXCollections.observableArrayList("Male", "Female","Other");

@FXML private RadioButton radioButtonYes, radioButtonNo;
@FXML private ToggleGroup internGroup;
@FXML private DatePicker dob;


@FXML
private void initialize(){
	sexChoiceBox.setItems(sexList);
	sexChoiceBox.setValue("Male");

	//radio button
	internGroup = new ToggleGroup();
	//radioButtonNo.setToggleGroup(internGroup);
	//radioButtonNo.setSelected(true);
	//radioButtonYes.setToggleGroup(internGroup);
}

private static DBManager dbManager;
private static PacientManager pacientManager;

public void introducePatient(){

	System.out.println("hola");

	String name = txtName.getText();
	String nif = txtNif.getText();
	String phoneNumber = txtPhoneNumber.getText();
	String adress = txtAdress.getText();
	String email = txtEmail.getText();
	String sex = sexChoiceBox.getValue();
	Boolean intern = false; //miraaaar esto

	int number = Integer.parseInt(phoneNumber);

	/*if(radioButtonNo.isSelected()==true){
		System.out.println("hollaa");
		intern = false;
	}else intern = true;*/


	Pacient newPacient = new Pacient(name, intern, nif,true, email, number,adress, sex );
	//System.out.println(pacient);

	dbManager = new SQLiteManager();
	dbManager.connect();

	pacientManager = dbManager.getPacientManager();

	pacientManager.add(newPacient);

}

public void clear(){

	txtName.clear();
	txtNif.clear();
	txtAdress.clear();
	txtEmail.clear();
	txtPhoneNumber.clear();
	sexChoiceBox.setValue("Male");
}

}
