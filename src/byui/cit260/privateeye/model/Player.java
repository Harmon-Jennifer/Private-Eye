/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jennifer
 */
public class Player implements Serializable {

    // class instance variables
    private String name;
    private String action;
    private String item;
    private double turnsLeft;
    private String inventoryList;
    private List<Item> cluesList;
    private List<Item> evidenceList;
    private Location location;

    public Player() {
        cluesList = new ArrayList<>();
    }

    public void addItemToCluesList(Item item) {
        cluesList.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getTurnsLeft() {
        return turnsLeft;
    }

    public void setTurnsLeft(double turnsLeft) {
        this.turnsLeft = turnsLeft;
    }

    public String getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(String inventoryList) {
        this.inventoryList = inventoryList;
    }

    public List<Item> getCluesList() {
        return cluesList;
    }

    public List<Item> getEvidenceList() {
        return evidenceList;
    }

    public void addItemToEvidenceList(Item item) {
        evidenceList.add(item);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.action);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.turnsLeft) ^ (Double.doubleToLongBits(this.turnsLeft) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.inventoryList);
        hash = 79 * hash + Objects.hashCode(this.cluesList);
        hash = 79 * hash + Objects.hashCode(this.evidenceList);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", action=" + action + ", turnsLeft=" + turnsLeft + ", inventoryList=" + inventoryList + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.turnsLeft) != Double.doubleToLongBits(other.turnsLeft)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.action, other.action)) {
            return false;
        }
        if (!Objects.equals(this.inventoryList, other.inventoryList)) {
            return false;
        }
        if (!Objects.equals(this.cluesList, other.cluesList)) {
            return false;
        }
        if (!Objects.equals(this.evidenceList, other.evidenceList)) {
            return false;
        }
        return true;
    }

}
