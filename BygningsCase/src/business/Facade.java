/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmusstamm
 */
public class Facade {

    List<Building> buildings;

    public Facade() {
        buildings = new ArrayList<>();
        createBuildings();
    }
    
    public void Driver(){
        buildings.get(0).getSensors().get(0).addMeasurement(678);
        System.out.println(buildings.get(0).printSensorLog(buildings.get(0).getSensors().get(0)));
    }
    

    public void createBuildings() {
        Building building1 = new Building("SDU", "Campusvej");
        building1.addSensor(new TempSensor(true));
        building1.addSensor(new Co2Sensor(true));
        buildings.add(building1);
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(int buildingIndex) {
        buildings.remove(buildingIndex);
    }

    public String showBuilding() {
        String s = "";
        for (int i = 0; i < buildings.size(); i++) {
            buildings.get(i).toString();
        }
        return s;
    }

}
