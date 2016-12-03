/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import java.util.Scanner;
import byui.cit260.privateeye.control.ListControl;
import java.util.Arrays;

/**
 *
 * @author Konkles
 */
public class EvidenceListView extends View {
   
    public EvidenceListView() {
        super("\n" 
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
              + "\nS - Sort evidence"  
              + "\nD - Delete from evidence"
              + "\nQ - Game Menu"
              + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
            case "A":
                this.addEvidence();
                break;
            case "S":
                this.sortEvidence();
                break;
            case "D":
                this.deleteEvidence();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid option: Please select an option from the Evidence Menu.");
                break;
        }
        return false;
    }

    private void addEvidence() {
        this.console.println("*** addEvidence function called ***");
    }
    
    private void sortEvidence() {
        this.console.println("Function called to Sort List");
        }

    private void deleteEvidence() {
        this.console.println("*** deleteEvidence function called ***");
    }
}
