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
 * @author Konkles
 */
public enum Drone implements Serializable{

    Murderer("This person that dunnit"),
    MathGenius("What's up with the bunnies?"),
    HomeworkKid("Absolutely hopeless"),
    Suspect("There's gonna be several of these");
    
    private final String droneType;
    private final String droneDesc;

    Drone(String description){
    this.droneDesc = description;
    droneType = new String("droneType");
}
    public String getDroneType() {
        return droneType;
    }

    public String getDroneDesc() {
        return droneDesc;
    }

    @Override
    public String toString() {
        return "Drone{" + "droneName=" + this + ", droneType=" + droneType + ", droneDesc=" + droneDesc + '}';
    }
    
    
    
}
