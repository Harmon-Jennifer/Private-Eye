/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigator;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Konkles
 */
public class Drone implements Serializable{
    private String droneName;
    private String droneType;
    private String droneDesc;

    public Drone() {
    }

    public String getDroneName() {
        return droneName;
    }

    public void setDroneName(String droneName) {
        this.droneName = droneName;
    }

    public String getDroneType() {
        return droneType;
    }

    public void setDroneType(String droneType) {
        this.droneType = droneType;
    }

    public String getDroneDesc() {
        return droneDesc;
    }

    public void setDroneDesc(String droneDesc) {
        this.droneDesc = droneDesc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.droneName);
        hash = 67 * hash + Objects.hashCode(this.droneType);
        hash = 67 * hash + Objects.hashCode(this.droneDesc);
        return hash;
    }

    @Override
    public String toString() {
        return "Drone{" + "droneName=" + droneName + ", droneType=" + droneType + ", droneDesc=" + droneDesc + '}';
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
        final Drone other = (Drone) obj;
        if (!Objects.equals(this.droneName, other.droneName)) {
            return false;
        }
        if (!Objects.equals(this.droneType, other.droneType)) {
            return false;
        }
        if (!Objects.equals(this.droneDesc, other.droneDesc)) {
            return false;
        }
        return true;
    }
    
    
    
}
