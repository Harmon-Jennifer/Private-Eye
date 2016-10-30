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
public class MainMenuView {
    
    private String menu;
    
    private void MainMenuView(){
        this.menu = "\n" 
                  + "\n----------------------------------------------"
                  + "\n| Main Menu                                  |"
                  + "\n----------------------------------------------"
                  + "\nN - Start new game"
                  + "\nS - Save game"
                  + "\nL - Load saved game"
                  + "\nH - Help menu"
                  + "\nQ - Quit"
                  + "\n----------------------------------------------";
    }

    void displayMainMenuView() {
        this.MainMenuView();
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
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.helpMenu();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Main Menu.");
                break;
        }
        return false;
    }
    
    private void startNewGame() {
       GameControl.createNewGame(PrivateEye.getPlayer());
       
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }
    
    private void saveGame() {
       System.out.println("*** saveGame function called ***");
    }
    
    private void loadSavedGame() {
       System.out.println("*** loadSavedGame function called ***");
    }
    
    private void helpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       
       helpMenuView.displayHelpMenuView();
    }
    
    
    
    
    
}
