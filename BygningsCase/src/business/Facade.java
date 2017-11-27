/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmusstamm
 */
public class Facade {

    private List<Building> buildings;

    public Facade() {
        buildings = new ArrayList<>();
    }

    public void addBuilding(String name, String address) {
        getBuildings().add(new Building(name, address));
    }

    public void removeBuilding(int buildingIndex) {
        getBuildings().remove(buildingIndex);
    }

    public String showBuilding() {
        String s = "";
        for (int i = 0; i < getBuildings().size(); i++) {
            getBuildings().get(i).toString();
        }
        return s;
    }

    /**
     * @return the buildings
     */
    public List<Building> getBuildings() {
        return buildings;
    }

    
    // https://www.mkyong.com/java/how-to-read-and-write-java-object-to-a-file/
    public void saveBuildings() {
        try {
            FileOutputStream f = new FileOutputStream(new File("saveBuildings.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            for (Building building : buildings) {
                o.writeObject(building);
            }

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("You did something wrong!");
        } catch (IOException e) {
            System.out.println("You did something else wrong!");
        }
    }

    public boolean loadBuildings() {
        try {
            FileInputStream fi = new FileInputStream(new File("saveBuildings.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            buildings.add((Building) oi.readObject());

        } catch (Exception e) {
        }
        return false;
    }
}
