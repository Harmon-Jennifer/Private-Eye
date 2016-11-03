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
 * @author Jennifer
 */
public class InventoryListView {
    
    private String menu;
    
    private void InventoryListView(){
        this.menu = "\n" 
                  + "\n----------------------------------------------"
                  + "\n| Inventory List                             |"
                  + "\n----------------------------------------------"
                  + "\nA - Notepad"
                  + "\nB - Pencil"
                  + "\nC - Your I.D."
                  + "\nE - Exit Inventory list."
                  + "\n----------------------------------------------";
    }

    void displayInventoryListView() {
        this.InventoryListView();
        boolean done = false; // loop will continue until done is true
        do {
            String menuOption = this.getMenuOption(); //call
            if (menuOption.toUpperCase().equals("E")) //player wants to quit
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
            case "A":
                this.inventoryNotePad();
                break;
            case "B":
                this.inventoryPencil();
                break;
            case "C":
                this.inventoryID();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Inventory list.");
                break;
        }
        return false;
    }
   
    private void inventoryNotePad() {
        System.out.println("*** inventoryNotePad information function called ***");
    }

    private void inventoryPencil() {
        System.out.println("*** inventoryPencil information function called ***");
    }

    private void inventoryID() {
        System.out.println("*** inventoryID information function called ***");
    }
   
}