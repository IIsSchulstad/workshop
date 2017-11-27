/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenration;

import business.Building;
import business.Co2Sensor;
import business.Facade;
import business.Measurement;
import business.Sensor;
import business.TempSensor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author rasmusstamm
 */
public class FXMLController implements Initializable {

    @FXML
    private Button addSensorButton;
    @FXML
    private ListView<Building> listBuildings;
    @FXML
    private AnchorPane createBuilding;
    @FXML
    private TextField buildingName;
    @FXML
    private TextField buildingAddress;
    @FXML
    private ListView<Sensor> listSensors;
    @FXML
    private ListView<Measurement> listMeasurements;
    @FXML
    private TextField sensorValue;
    @FXML
    private ComboBox<String> comboBoxSensorList;

    private ObservableList<Building> buildingObservableList;
    private ObservableList<Sensor> sensorObservableList;
    private ObservableList<Measurement> measurementObservableList;
    private ObservableList<String> sensorTypeObservableList;
    private Building selectedBuilding;
    private Sensor selectedSensor;

    Facade facade = new Facade();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.buildingObservableList = FXCollections.observableArrayList(facade.getBuildings());
        sensorTypeObservableList = FXCollections.observableArrayList();
        sensorTypeObservableList.add("TempSensor");
        sensorTypeObservableList.add("CO2Sensor");
        this.comboBoxSensorList.setItems(sensorTypeObservableList);

    }

    @FXML
    private void addSensorButton(ActionEvent event) {
        if (comboBoxSensorList.getSelectionModel().getSelectedIndex() == 0) {
            selectedBuilding.addSensor(new TempSensor(true));
        } else {
            selectedBuilding.addSensor(new Co2Sensor(true));
        }
        updateListViews();
    }

    @FXML
    private void addBuildingButton(ActionEvent event) {
        facade.addBuilding(buildingName.getText(), buildingAddress.getText());
        updateListViews();
    }

    @FXML
    private void addMeasurementButton(ActionEvent event) {
    }

    @FXML
    private void checkSelectedBuilding(MouseEvent event) {
        selectedBuilding = listBuildings.getSelectionModel().getSelectedItem();
        updateListViews();
    }

    private void updateListViews() {
        if (!facade.getBuildings().isEmpty()) {
            this.buildingObservableList = FXCollections.observableArrayList(facade.getBuildings());
            listBuildings.setItems(buildingObservableList);
            if (selectedBuilding != null && !selectedBuilding.getSensors().isEmpty()) {
                this.sensorObservableList = FXCollections.observableArrayList(selectedBuilding.getSensors());
                listSensors.setItems(sensorObservableList);
                if (!selectedSensor.getLog().isEmpty()) {
                    this.measurementObservableList = FXCollections.observableArrayList(selectedSensor.getLog());
                    listMeasurements.setItems(measurementObservableList);
                }
            }
        }
    }

    @FXML
    private void checkSelectedSensors(MouseEvent event) {
        selectedSensor = listSensors.getSelectionModel().getSelectedItem();
        updateListViews();
    }
}
