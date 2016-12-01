/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import byui.cit260.privateeye.model.Map;
import privateeye.PrivateEye;

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
              + "\nQ - Exit Game Menu"
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
                this.mapView();
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
                System.out.println("\nInvalid option: Please select an option from the Game Menu.");
                break;
        }
        return false;
    }
    
    private void evidenceList() {
        EvidenceListView evidenceListView = new EvidenceListView ();
        evidenceListView.display();
    }

    private void cluesList() {
       CluesListView cluesListView = new CluesListView ();
       cluesListView.display();
    }

    private void inventoryList() {
        InventoryListView inventoryListView = new InventoryListView ();
        inventoryListView.display();
    }

    private void mapView() {
        Map map = PrivateEye.getCurrentGame().getMap();
        System.out.println("\n\n------------------");
        for(int row = 0; row < Map.NUMROWS; row++){
            System.out.print("| ");
            for(int col = 0; col < Map.NUMCOLUMNS; col++){
                char localeType = map.getLocaleAt(row, col).getLocaleType().toString().charAt(0);
                System.out.print(localeType + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------\n\n");
    }

    protected void moveLocation() {
        MoveLocationsView moveLocationsView = new MoveLocationsView();
        moveLocationsView.display();
    }

    private void exploreLocation() {
        System.out.println("*** exploreLocation function called ***");
    }

    private void talkToPeople() {
        TalkView talkView = new TalkView();
        talkView.display();
    }
}
