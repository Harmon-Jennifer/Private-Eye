/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

import byui.cit260.privateeye.model.*;
import privateeye.PrivateEye;

/**
 *
 * @author User
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game currentGame = new Game(); //create new game
               
        currentGame.setPlayer(player); // save player in game
        
        //create the inventory list
        Item[] inventoryList = ListControl.createInventoryList();
        currentGame.setInventoryList(inventoryList);
        
        Item[] evidenceList = ListControl.createEvidenceList();
        currentGame.setEvidenceList(evidenceList);
        
        Item[] clueList = ListControl.createClueList();
        currentGame.setClueList(clueList);
        
        Map map = MapControl.createMap(); // create and initialize new map
        map.init();
        currentGame.setMap(map); // save map in game
        
        PrivateEye.setCurrentGame(currentGame); // save in PrivateEye
    }

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        PrivateEye.setPlayer(player); // save the player
        
        return player;
    }

}
