/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import byui.cit260.privateeye.model.Map;
import privateeye.PrivateEye;
import byui.cit260.privateeye.view.MapView;
import java.io.PrintWriter;
import byui.cit260.privateeye.model.Item;

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
                + "\nG - Print Item List"
                + "\nP - Print Location List"
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
            case "G":
                this.getItemNames();
                break;
            case "P":
                this.printLocationList();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid option: Please select an option from the Game Menu.");
                break;
        }
        return false;
    }

    private void evidenceList() {
        EvidenceListView evidenceListView = new EvidenceListView();
        evidenceListView.display();
    }

    private void cluesList() {
        CluesListView cluesListView = new CluesListView();
        cluesListView.display();
    }

    private void inventoryList() {
        InventoryListView inventoryListView = new InventoryListView();
        inventoryListView.display();
    }

    private void mapView() {
        Map map = PrivateEye.getCurrentGame().getMap();
        int visited = map.sumMapVisited(map);
        this.console.println("\n\n*--------------------*");
        this.console.println("|   Visited: " + visited + "/25    |");
        this.console.println("|--------------------|");
        this.console.println("|   |  1  2  3  4  5 |");
        this.console.println("|--------------------|");
        int i = 1;
        for (int row = 0; row < Map.NUMROWS; row++) {
            this.console.print("| " + i + " | ");
            i++;
            for (int col = 0; col < Map.NUMCOLUMNS; col++) {
                char localeType = map.getLocaleAt(row, col).getLocaleType().toString().charAt(0);
                this.console.print(" " + localeType);
                if(map.getLocaleAt(row, col).getItem() != null) {
                    this.console.print(map.getLocaleAt(row, col).getItem().getItemName().charAt(0));
                }
                 else {
                    this.console.print(" ");
                }
                }
             
            this.console.println("|");
        }
        this.console.println("*--------------------*");
    }

    protected void moveLocation() {
        MoveLocationsView moveLocationsView = new MoveLocationsView();
        moveLocationsView.display();
    }

    private void exploreLocation() {
        this.console.println("*** exploreLocation function called ***");
    }

    private void talkToPeople() {
        TalkView talkView = new TalkView();
        talkView.display();
    }

    private void getItemNames() {
        try {
            String filePath = "itemReport.txt";
            PrintWriter output = new PrintWriter(filePath);

            output.printf("Notepad\n");
            output.printf("Pencil\n");
            output.printf("Your ID\n");
            output.printf("Bullet casing\n");
            output.printf("Fingerprint\n");
            output.printf("Bloody glove\n");

            output.flush();

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }

    private void printLocationList() {
        try {
            String filePath = "locationList.txt";
            PrintWriter output = new PrintWriter(filePath);
            Map map = PrivateEye.getCurrentGame().getMap();

            output.println("Location List");
            for (int row = 0; row < Map.NUMROWS; row++) {
                for (int col = 0; col < Map.NUMCOLUMNS; col++) {
                    output.println(map.getLocaleAt(row, col).getLocaleType());
                    output.flush();
                }
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }

}
