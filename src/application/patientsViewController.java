package application;

import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pojos.Patient;

public class patientsViewController implements Initializable{

	@FXML private TableView patientsTable;
	@FXML private TableColumn<Patient, Integer> patientIDColumn;
	@FXML private TableColumn<Patient, String> patientNameColumn;
	@FXML private TableColumn<Patient, String> patientNifColumn;
	@FXML private TableColumn<Patient, String> patientEmailColumn;
	@FXML private TableColumn<Patient, String> patientAdressColumn;
	@FXML private TableColumn<Patient, Integer> patientPhoneNumberColumn;
	@FXML private TableColumn<Patient, LocalDate> patientDobColumn;
	@FXML private TableColumn<Patient, String> patientSexColumn;
	
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		patientIDColumn.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("id"));
		patientNameColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("name")); //el nombre entre parentesis el de la clase patient
		patientNifColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("nif"));
		patientEmailColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("email"));
		patientPhoneNumberColumn.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("phoneNumber"));
		patientAdressColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("adress"));
		patientSexColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("sex"));
		patientDobColumn.setCellValueFactory(new PropertyValueFactory<Patient, LocalDate>("dob"));
		
	
			
			loadPatients();
			
		
	}
	
	public void loadPatients(){
		ObservableList<Patient> patientsList = FXCollections.observableArrayList();
		Patient patient = new Patient(1, "tanos", LocalDate.now(), "jjj", "6767", 89898,"paseo", "male");
		patientsList.add(patient);
		patientsTable.getItems().addAll(patientsList);
	}

}
