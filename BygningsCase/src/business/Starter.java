/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Kim Christensen
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building building1 = new Building("SDU", "Campusvej");
        building1.addSensor(new TempSensor(true));
        building1.addSensor(new Co2Sensor(false));
        System.out.println(building1.showSensors());
    }
    
}
