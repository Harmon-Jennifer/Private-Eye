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
public class Location implements Serializable{
    
    
    // class instance variables
    private int localeRow;
    private int localeColumn;
    private Boolean localeVisited;
    private Drone droneList;
    private LocaleType localeType;
    private final String coordinates;
    
    Location() {
        coordinates = ("Row" + localeRow + "Column" + localeColumn);
        ArrayList<Drone> droneList = new ArrayList<>();
        
    }

    public Drone getDroneList() {
        return droneList;
    }

    public void setLocaleType(LocaleType localeType) {
        this.localeType = localeType;
    }

    public LocaleType getLocaleType() {
        return localeType;
    }

    public int getLocaleRow() {
        return localeRow;
    }

    public void setLocaleRow(int localeRow) {
        this.localeRow = localeRow;
    }

    public int getLocaleColumn() {
        return localeColumn;
    }

    public void setLocaleColumn(int localeColumn) {
        this.localeColumn = localeColumn;
    }

    public Boolean getLocaleVisited() {
        return localeVisited;
    }

    public void setLocaleVisited(Boolean localeVisited) {
        this.localeVisited = localeVisited;
    }

    
    @Override
    public String toString() {
        String location = ("coordinates=" + coordinates + ", localeType=" + this +  ", droneList=" + droneList);
        return location;
    }


    
}

