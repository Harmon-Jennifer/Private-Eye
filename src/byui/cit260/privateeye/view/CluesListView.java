/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import java.util.Scanner;


/**
 *
 * @author Mark
 */
public class CluesListView {
    
    private String menu;
    
    private void CluesListView(){
        this.menu = "\n" 
                  + "\n----------------------------------------------"
                  + "\n| Clues                                      |"
                  + "\n     INSERT LIST OF NUMBERED CLUES"
                  + "\n----------------------------------------------"
                  + "\nD - Get description of the clue."
                  + "\nE - Exit Clues List."
                  + "\n----------------------------------------------";
    }

    void displayCluesListView() {
        this.CluesListView();
        boolean done = false; // loop will continue until done is true
        do {
            String menuOption = this.getMenuOption(); //call
            if (menuOption.toUpperCase().equals("E")) //player wants to leave menu
                return; //exits menu
            
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
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }                                
        return menuOption; // return the value entered
    }

    private boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase();
        
        switch (menuOption) {
            case "D":
                this.cluesGetDescription();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Help Menu.");
                break;
        }
        return false;
    }
   
    private void cluesGetDescription() {
        System.out.println("*** cluesGetDescription function called ***");
    }
    
}
