/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jennifer
 */
public enum Location implements Serializable{
    
    Loc1("location1"),
    //add 2 - 24 later
    Loc25("location1");
    
    // class instance variables
    private String localeDesc;
    private Drone droneList;

    Location(String description) {
        this.localeDesc = description;
        ArrayList<Drone> droneList = new ArrayList<>();
    }

    public String getLocaleDesc() {
        return localeDesc;
    }

    public Drone getDroneList() {
        return droneList;
    }



    @Override
    public String toString() {
        return "Location{" + "localeName=" + this + ", localeDesc=" + localeDesc + ", droneList=" + droneList + '}';
    }
    
    
}

