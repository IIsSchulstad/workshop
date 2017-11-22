/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Kim Christensen
 */
public class Building {

    //The attributes a building should have
    private ArrayList<Sensor> sensors;
    private String name;
    private String address;

    //Constructor for building
    public Building(String name, String address) {
        this.name = name;
        this.address = address;
        sensors = new ArrayList<>();
    }
    //Methods 

    /**
     * @return the sensors
     */
    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    //add sensor
    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public void removeSensor(int sensorIndex) {
        sensors.remove(sensorIndex);
    }

    public String showSensors() {
        String s = "";

        for (int i = 0; i < sensors.size(); i++) {
            s += i + " " + sensors.get(i).toString() + "\n";
        }
        return s;
    }

    public String printSensorLog(Sensor sensor) {
        String s = "";

        for (int i = 0; i < sensor.getLog().size(); i++) {
            s += sensor.getLog().get(i);
        }
        return s;
    }

    @Override
    public String toString() {
        String s = "";
        s += name + "\n";
        s += address + "\n";
        s += showSensors() + "\n\n";
        return s;
    }
}
