/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
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
    private MenuItem choice1;
    @FXML
    private ListView<?> listBuildings;
    @FXML
    private AnchorPane createBuilding;
    @FXML
    private TextField buildingName;
    @FXML
    private TextField buildingAddress;
    @FXML
    private ListView<?> listSensors;
    @FXML
    private ListView<?> listMeasurements;
    @FXML
    private TextField sensorValue;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addSensorButton(ActionEvent event) {
    }

    @FXML
    private void addBuildingButton(ActionEvent event) {
    }

    @FXML
    private void addMeasurementButton(ActionEvent event) {
    }
    
}
