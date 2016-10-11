/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jennifer
 */
public class Location implements Serializable{
    
    // class instance variables
    private String localeName;
    private String localeDesc;
    private String droneList;

    public Location() {
    }

    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    public String getLocaleDesc() {
        return localeDesc;
    }

    public void setLocaleDesc(String localeDesc) {
        this.localeDesc = localeDesc;
    }

    public String getDroneList() {
        return droneList;
    }

    public void setDroneList(String droneList) {
        this.droneList = droneList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "localeName=" + localeName + ", localeDesc=" + localeDesc + ", droneList=" + droneList + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.localeName, other.localeName)) {
            return false;
        }
        if (!Objects.equals(this.localeDesc, other.localeDesc)) {
            return false;
        }
        if (!Objects.equals(this.droneList, other.droneList)) {
            return false;
        }
        return true;
    }
    
    
    
}

