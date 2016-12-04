/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import byui.cit260.privateeye.model.Map;
import java.io.PrintWriter;
import privateeye.PrivateEye;

/**
 *
 * @author Konkles
 */

//  Subclass of View
public class MapView extends View{
    
    //MapView constructor
    public MapView(String message) {
        this.displayMessage = message;
    }
    
    public MapView() {
        super("\n" 
              + "\n----------------------------------------------"
              + "\n| Map Menu"
              + "\n----------------------------------------------"
              + "\nL - List of possible all locations"
              + "\nV - List of previously visited locations"
              + "\nU - List of unvisited locations"
              + "\nM - Move Locations Menu"             
              + "\nQ - Exit Map Menu" 
              + "\n----------------------------------------------");   
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "L":
                this.mapGetLocations();
                break;
            case "V":
                this.mapGetVisited();
                break;
            case "U":
                this.mapGetUnvisited();
                break;
            case "M":
                this.moveLocation();
                break;  
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid option: Please select an option from the Map Menu.");
                break;
        }
        return false;
    }
//  List all the locations in the game.  
    protected void mapGetLocations() {
        this.console.println("*** mapGetLocations function called ***");
    }
//  Shows only the locations that the user has visited.
    protected void mapGetVisited() {
        this.console.println("*** mapGetVisited function called ***");
    }
//  Shows only the locations the user has not visited.
    protected void mapGetUnvisited() {
        this.console.println("*** mapGetUnvisited function called ***");
    }
    
//  This allows the user to go directly from the map view to the move location view, instead of forcing them to exit out to the game menu and then to the move locations view.
    protected void moveLocation() {
        MoveLocationsView moveLocationsView = new MoveLocationsView();
        moveLocationsView.display();
    }
}
