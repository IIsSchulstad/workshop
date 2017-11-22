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
    protected double measurement;
    protected ArrayList<Double>sensorLog;
    
    public void getMeasurement(){
        //Will get the measurement
    }

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
}
