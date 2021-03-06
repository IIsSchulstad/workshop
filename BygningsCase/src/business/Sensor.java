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
public abstract class Sensor {
    protected boolean isTurnedOn;
    protected ArrayList<Measurement>sensorLog;

    /**
     * @return the isTurnedOn
     */
    public boolean getIsTurnedOn() {
        return isTurnedOn;
    }

    /**
     * @param isTurnedOn the isTurnedOn to set
     */
    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }
    
    public ArrayList<Measurement> getLog(){
        return sensorLog;
    }
    
    public void addMeasurement(Measurement measurement){
        sensorLog.add(measurement);
    }
}
