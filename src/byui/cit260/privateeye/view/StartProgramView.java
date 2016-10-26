/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import byui.cit260.privateeye.control.GameControl;
import byui.cit260.privateeye.model.Player;
import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class StartProgramView {
    
        private String promptMessage;
       
        public StartProgramView() {
            this.promptMessage = "\nPlease enter your name: ";
            this.displayBanner();
        }

    private void displayBanner() {
        System.out.println(
              "\n*****"
            + "\n*"
            + "\nThere's been a murder, and your friend's been wrongfully "
            + "\nimprisoned for it. Luckily, you're a private investigator, and "
            + "\nyou've got the skills and guts to apprehend the real killer. At "
            + "\nleast, that's what you've told everyone."
            +"\n\nTo solve this mystery, you'll walk around town, interacting "
            + "\nwith its denizens, avoiding traps, and gathering clues. If you "
            + "\nsurvive, you'll be able to formally accuse the murderer, then "
            + "\ncross your fingers that you've gathered enough evidence to land "
            + "\na conviction. Otherwise, you might be out of a job."
            + "\n\nGood luck, because this won't be easy. "
            + "\nBut then again, no one ever calls you for the easy ones."
            + "\n*"
            + "\n*****");
    }

    public void displayStartProgramView() {
        
        boolean done = false; // loop will continue until done is true
        do {
            String playersName = this.getPlayersName(); //call
            if (playersName.toUpperCase().equals("Q")) //player wants to quit
                return; //exits game
            
            done = this.doAction(playersName); //done is now true
            
        } while (!done); //loop ends when done is true
    }

    private String getPlayersName() { 
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: " + "The name must be greater than one character in length");
        return false;
    }

    // call the createPlayer() control function
    Player player = GameControl.createPlayer(playersName);
    
    if (player == null) { // if unsuccessful
        System.out.println("\n/Error creating the player.");
        return false;
    }
    
    // display next view
    this.displayNextView(player);
    
    return true; // sucess!
    }
    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n=============================================" 
                          + "\n Welcome to the game " + player.getName() 
                          + "\n Now go find the killer and free your friend." 
                          + "\n============================================="
                          );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the mina menu view
        mainMenuView.displayMainMenuView();    
    }

}    