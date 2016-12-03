/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateeye;

import byui.cit260.privateeye.model.Location;
import byui.cit260.privateeye.model.Map;
import byui.cit260.privateeye.model.Item;
import byui.cit260.privateeye.model.Drone;
import byui.cit260.privateeye.model.Game;
import byui.cit260.privateeye.model.Player;
import byui.cit260.privateeye.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;


public class PrivateEye {

    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PrivateEye.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PrivateEye.player = player;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PrivateEye.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PrivateEye.inFile = inFile;
    }
    
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PrivateEye.logFile = logFile;
    }
    
    public static void main(String[] args)  throws IOException {
       
        StartProgramView startProgramView = null;
        try{
            //open character stream files for end user input and output
            PrivateEye.inFile = new BufferedReader(new InputStreamReader(System.in));
            PrivateEye.outFile = new PrintWriter(System.out, true);    
            //open log file for logging errors
            String filePath = "log.txt";
            PrivateEye.logFile = new PrintWriter(filePath);
            
            startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
        } catch (Exception e) {
            startProgramView.displayStartProgramView();
            //e.printStackTrace();
        }
        finally {
            try {
                if (PrivateEye.inFile != null)
                    PrivateEye.inFile.close();
                if (PrivateEye.outFile != null)
                    PrivateEye.outFile.close();
                if (PrivateEye.logFile != null)
                    PrivateEye.logFile.close();
            } catch (IOException e) {
                System.out.println("Error closing files");
                return;
            }    
        }
        
        /*
        Drone testDrone = new Drone();
        
        testDrone.setDroneName("John Doe");
        testDrone.setDroneType("Suspect");
        testDrone.setDroneDesc("An unidentified man wanted for questioning.");
        
        Item testItem = new Item();
        
        testItem.setItemName("Doohicky");
        testItem.setItemType("Tool");
        testItem.setItemDesc("No one knows what it does or what it's used for.");
        
        Location testLocation = new Location();
        
        testLocation.setLocaleName("Hell's Kitchen");
        testLocation.setLocaleDesc("A place filled with an odd number of vigilantes and megalomaniacs.");
        testLocation.setDroneList("People in Hell's Kitchen.");
        
        Map testMap = new Map();
        
        testMap.setMapName("Dangerous City");
        testMap.setLocaleList(6);
        testMap.setNumColumns(10);
        testMap.setNumRows(8);
        
        Player testPlayer = new Player();
        
        testPlayer.setName("Shawn Spencer");
        testPlayer.setAction("look");
        testPlayer.setItemList("Items available for use");
        testPlayer.setTurnsLeft(20);
        
        
        String droneInfo = testDrone.toString();
        String itemInfo = testItem.toString();
        String locationInfo = testLocation.toString();
        String mapInfo = testMap.toString();
        String playerInfo = testPlayer.toString();
        
        System.out.println(droneInfo);
        System.out.println(itemInfo);
        System.out.println(locationInfo);
        System.out.println(mapInfo);
        System.out.println(playerInfo);
        */
        //Mark here. Hope this effing works finally
        
        
/*        
        System.out.println("Please enter your name, Detective:");
		
		Scanner inFile;
		inFile = new Scanner(System.in);        
        String name = inFile.nextLine();
        
Opening dialog. - Setting the scene - The squenced execution makes it seem more interactive.
*     
        System.out.println("\nIt was a quiet night - a little too quiet - when the door to my office creeked open. Even though my back was turned I knew who this dame was from the unmistakable scent of her White Diamonds perfume.\n");
        try{ Thread.sleep(7000); }catch( Exception e ){}
        System.out.println("\n"+name+": \"I thought I told you I never wanted to to see you again.\"\n");
        try{ Thread.sleep(3500); }catch( Exception e ){}
        System.out.println("\nTrixie: \"I wouldn't be here, but Donny has been arrested.\"\n");
        try{ Thread.sleep(3000); }catch( Exception e ){}
        System.out.println("\nI grinned.\n");
        try{ Thread.sleep(1000); }catch( Exception e ){}
        System.out.println("\n"+name+": \"I can't say that surpirses me; it's been a long time comin' dollface. You know that?\"\n");
        try{ Thread.sleep(4500); }catch( Exception e ){}
        System.out.println("\nTrixie: \"The Feds say he murdered that man last night!! Donny's no saint, but we both know he's no murderer!\"\n");
        try{ Thread.sleep(4500); }catch( Exception e ){}
        System.out.println("\n"+name+": \"Speak for yourself.\"\n");
        try{ Thread.sleep(1000); }catch( Exception e ){}
        System.out.println("\nTrixie: \"You shut your mouth! You and Donny used to be best friends; what happened between you two?\"\n");
        try{ Thread.sleep(4500); }catch( Exception e ){}
        System.out.println("\n"+name+": \"He stole my girl thats what happenned!\"\n");
        try{ Thread.sleep(2000); }catch( Exception e ){}
        System.out.println("\nTrixie: \"Donny didn't steal me; you pushed me away! We never meant for it to happen, but he's my soulmate "+name+", and if you ever loved me, please help me now. You're my only hope.\"\n");
        try{ Thread.sleep(6000); }catch( Exception e ){}
        System.out.println("\nI could hear her sobbing as I stared out my office window; I always had a weakness for damsels in distress, especially one like Trixie Trueheart.\n");
        try{ Thread.sleep(6000); }catch( Exception e ){}
        System.out.print("\n"+name+": \"Fine");
        try{ Thread.sleep(1500); }catch( Exception e ){}
        System.out.print("... ");
        try{ Thread.sleep(1500); }catch( Exception e ){}
        System.out.print("I'll take the case.\"\n");
        try{ Thread.sleep(1000); }catch( Exception e ){}
        System.out.println("\nTrixie: \"Thank you, thank you "+name+", I knew I count on you.\"\n");
   */ }
}
