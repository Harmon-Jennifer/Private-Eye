/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

import byui.cit260.privateeye.exceptions.GameControlException;
import byui.cit260.privateeye.model.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import privateeye.PrivateEye;

/**
 *
 * @author User
 */
public class GameControl {

    public void createNewGame(Player player) {

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

        createAndAssignItems(map);

        PrivateEye.setCurrentGame(currentGame); // save in PrivateEye
    }

    private void createAndAssignItems(Map map) {

        List<Item> items = new ArrayList<>();
        Item glove = new Item();
        glove.setItemDesc("A bloody glove");
        glove.setItemName("glove");
        items.add(glove);

        Item gun = new Item();
        gun.setItemDesc("A smoking gun");
        gun.setItemName("gun");
        items.add(gun);

        Item fingerprint = new Item();
        fingerprint.setItemDesc("Some very distinctive fingerprints");
        fingerprint.setItemName("fingerprints");
        items.add(fingerprint);

        Random rand = new Random();

        for (Item item : items) {
            boolean placed = false;
            while (!placed) {
                int randomRow = rand.nextInt(Map.NUMROWS);
                int randomCol = rand.nextInt(Map.NUMCOLUMNS);

                Location location = map.getLocaleAt(randomRow, randomCol);
                if (location.getItem() == null) {
                    location.setItem(item);
                    placed = true;
                }
            }
        }
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

    public static void saveGame(Game game, String filepath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game); //write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void loadGame(String filepath) throws GameControlException {
        Game game = null;
        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        PrivateEye.setCurrentGame(game);
    }
}
