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
public class CluesListView extends View {
    
    public CluesListView() {
        super("\n" 
              + "\n----------------------------------------------"
              + "\n| Clues                                      |"
              + "\n     INSERT LIST OF NUMBERED CLUES"
              + "\n----------------------------------------------"
              + "\nD - Get description of the clue."
              + "\nE - Exit Clues List."
              + "\n----------------------------------------------");
    
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
