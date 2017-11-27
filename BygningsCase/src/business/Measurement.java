/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.sql.Time;

/**
 *
 * @author Nikolaj Frank-Jensen
 */
public class Measurement {
    Time time;
    Double data;
    
    public Measurement(double data){
        this.data = data;
        time = new Time(System.currentTimeMillis());
    }
    @Override
    public String toString(){
        return this.time + " " + this.data;
    }
}
