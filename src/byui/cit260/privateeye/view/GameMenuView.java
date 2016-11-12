/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

/**
 *
 * @author Konkles
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n" 
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
              + "\nQ - Main Menu"
              + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
            case "E":
                this.evidenceList();
                break;
            case "C":
                this.cluesList();
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
        EvidenceListView evidenceListView = new EvidenceListView ();
        evidenceListView.display();
    }

    private void cluesList() {
       System.out.println("*** clueList function called ***");
       CluesListView cluesListView = new CluesListView ();
       cluesListView.display();
    }

    private void inventoryList() {
        System.out.println("*** inventoryList function called ***");
        InventoryListView inventoryListView = new InventoryListView ();
        inventoryListView.display();
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
