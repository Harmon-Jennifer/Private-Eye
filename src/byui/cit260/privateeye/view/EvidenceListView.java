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
public class EvidenceListView {
    private String evidenceList;
    
    private void EvidenceListView(){
        this.evidenceList = "\n" 
                + "\n----------------------------------------------"
                + "\n| Evidence List                              |"
                + "\n----------------------------------------------"
                + "\n - Bullet casing"
                + "\n - Finger prints"
                + "\n - Bloody glove"
                + "\n - Motive"
                + "\n----------------------------------------------"
                + "\n| Evidence Menu                              |"
                + "\n----------------------------------------------"
                + "\nA - Add to evidence"
                + "\nD - Delete from evidence"
                + "\nG - Game Menu"
                + "\n----------------------------------------------";
    }
    
    void displayEvidenceListView() {
        this.EvidenceListView();
        boolean done = false; // loop will continue until done is true
        do {
            String menuOption = this.getMenuOption(); //call
            if (menuOption.toUpperCase().equals("G")) //player wants to quit
                return; //exits game
            
            done = this.doAction(menuOption); //done is now true
            
        } while (!done); //loop ends when done is true
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String menuOption = "";
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.evidenceList);
            
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
            case "A":
                this.addEvidence();
                break;
            case "D":
                this.deleteEvidence();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Evidence Menu.");
                break;
        }
        return false;
    }

    private void addEvidence() {
        System.out.println("*** addEvidence function called ***");
    }

    private void deleteEvidence() {
        System.out.println("*** deleteEvidence function called ***");
    }
}
