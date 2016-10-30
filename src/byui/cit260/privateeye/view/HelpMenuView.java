/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;
import byui.cit260.privateeye.control.GameControl;
import byui.cit260.privateeye.model.Player;
import privateeye.PrivateEye;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class HelpMenuView {
    
    private String menu;
    
    private void HelpMenuView(){
        this.menu = "\n" 
                  + "\n----------------------------------------------"
                  + "\n| Help Menu                                  |"
                  + "\n----------------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move."
                  + "\nI - How to interact with people and objects."
                  + "\nA - How to accuse a suspect."
                  + "\nQ - Quit"
                  + "\n----------------------------------------------";
    }

    void displayHelpMenuView() {
        this.HelpMenuView();
        boolean done = false; // loop will continue until done is true
        do {
            String menuOption = this.getMenuOption(); //call
            if (menuOption.toUpperCase().equals("Q")) //player wants to quit
                return; //exits game
            
            done = this.doAction(menuOption); //done is now true
            
        } while (!done); //loop ends when done is true
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String menuOption = "";
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
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
            case "G":
                this.helpGameGoal();
                break;
            case "M":
                this.helpMove();
                break;
            case "I":
                this.helpInteract();
                break;
            case "A":
                this.helpAccuse();
                break;
            case "Q":
                MainMenuView mainMenuView = new MainMenuView();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Help Menu.");
                break;
        }
        return false;
    }
   
    private void helpGameGoal() {
        System.out.println("*** helpGameGoal function called ***");
    }

    private void helpMove() {
        System.out.println("*** helpMove function called ***");
    }

    private void helpInteract() {
        System.out.println("*** helpInteract function called ***");
    }

    private void helpAccuse() {
        System.out.println("*** helpAccuse function called ***");
    }    
}
