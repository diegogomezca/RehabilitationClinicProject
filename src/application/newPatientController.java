package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import pojos.Patient;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;

import db.interfaces.*;
import db.sqlite.SQLiteManager;



public class newPatientController implements Initializable{

@FXML private TextField txtName, txtNif, txtPhoneNumber, txtAdress, txtEmail;
@FXML private ChoiceBox<String> sexChoiceBox;
@FXML private RadioButton radioButtonYes, radioButtonNo;
@FXML private ToggleGroup internGroup;
@FXML private DatePicker dobPicker;

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
	LocalDate date = dobPicker.getValue();

	//Pasamos de LocalDate a Date
	Date dob = Date.valueOf(date);

	int number = Integer.parseInt(phoneNumber);

	/*if(radioButtonNo.isSelected()==true){
		System.out.println("hollaa");
		intern = false;
	}else intern = true;*/



	Patient newPacient = new Patient(name, intern, nif,true, email, number,adress, sex );
	//System.out.println(pacient);

	dbManager = new SQLiteManager();
	dbManager.connect();

	pacientManager = dbManager.getPacientManager();

	pacientManager.add(newPacient);

}

public void backToMenu(ActionEvent event){
	System.out.print("hola");
	SceneChanger sc = new SceneChanger();
	sc.changeScenes(event,"menu.fxml", "menu");
	//System.out.print("hola");
}

public void clear(){

	txtName.clear();
	txtNif.clear();
	txtAdress.clear();
	txtEmail.clear();
	txtPhoneNumber.clear();
	sexChoiceBox.setValue("Male");
}

@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub

	ObservableList<String> sexList = FXCollections.observableArrayList("Male", "Female","Other");
	sexChoiceBox.setItems(sexList);
	sexChoiceBox.setValue("Male");

}

}
