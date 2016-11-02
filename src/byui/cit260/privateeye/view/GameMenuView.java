/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;
import java.util.Scanner;

/**
 *
 * @author Konkles
 */
public class GameMenuView {
    
    private String gameMenu;
    
    private void GameMenuView(){
        this.gameMenu = "\n" 
                + "\n----------------------------------------------"
                + "\n| Game Menu                                  |"
                + "\n----------------------------------------------"
                + "\nE - Evidence list"
                + "\nC - Clue list"
                + "\nI - Inventory list"
                + "\nV - View map"
                + "\nL - Move locations"
                + "\nX - Explore location"
                + "\nT - Talk to people"
                + "\nM - Main Menu"
                + "\n----------------------------------------------";
    }
    
    void displayGameMenu() {
        this.GameMenuView();
        boolean done = false; // loop will continue until done is true
        do {
            String menuOption = this.getMenuOption(); //call
            if (menuOption.toUpperCase().equals("M")) //player wants to quit
                return; //exits game
            
            done = this.doAction(menuOption); //done is now true
            
        } while (!done); //loop ends when done is true
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String menuOption = "";
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.gameMenu);
            
            menuOption = keyboard.nextLine(); // get next line typed on the keyboard
            menuOption = menuOption.trim(); // trim off leading and trailing blanks
            
            if (menuOption.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }                                
        return menuOption; // return the value entered
    }
    
    private boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase();
        
        switch (menuOption) {
            case "E":
                this.evidenceList();
                break;
            case "C":
                this.clueList();
                break;
            case "I":
                this.inventoryList();
                break;
            case "V":
                this.viewMap();
                break;
            case "L":
                this.moveLocation();
                break;
            case "X":
                this.exploreLocation();
                break;
            case "T":
                this.talkToPeople();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Main Menu.");
                break;
        }
        return false;
    }

    private void evidenceList() {
        System.out.println("*** evidenceList function called ***");
//        EvidenceListView evidenceListView = new EvidenceListView ();
//        evidenceListView.displayEvidenceListView();
    }

    private void clueList() {
        System.out.println("*** clueList function called ***");
//        ClueListView clueListView = new ClueListView ();
//        clueListView.displayClueListView();
    }

    private void inventoryList() {
        System.out.println("*** inventoryList function called ***");
//        InventoryListView inventoryListView = new InventoryListView ();
//        inventoryListView.displayInventoryListView();
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
    }

    private void moveLocation() {
        System.out.println("*** moveLocation function called ***");
    }

    private void exploreLocation() {
        System.out.println("*** exploreLocation function called ***");
    }

    private void talkToPeople() {
        System.out.println("*** talkToPeople function called ***");
    }
}
