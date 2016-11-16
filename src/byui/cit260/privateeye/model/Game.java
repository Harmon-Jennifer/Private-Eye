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
public class Game implements Serializable {

    private Item[] inventoryList;
    private Item[] clueList;
    private Item[] evidenceList;

    private Map map;
    private Player player;
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    public Item[] getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(Item[] inventoryList) {
        this.inventoryList = inventoryList;
    }

    public Item[] getClueList() {
        return clueList;
    }

    public void setClueList(Item[] clueList) {
        this.clueList = clueList;
    }

    public Item[] getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(Item[] evidenceList) {
        this.evidenceList = evidenceList;
    }
    
}
