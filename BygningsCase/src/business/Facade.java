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

}
