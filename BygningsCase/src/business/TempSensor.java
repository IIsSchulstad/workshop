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
public class TempSensor extends Sensor {
    
public TempSensor(boolean isTurnedOn){
    this.sensorLog = new ArrayList<>();
    this.isTurnedOn = isTurnedOn;
}

    @Override
    public String toString(){
        return "TempSensor";
    }
}
