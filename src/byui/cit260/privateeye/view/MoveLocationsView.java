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
public class MoveLocationsView extends MapView {
    
//  Subclass of MapView  
    public MoveLocationsView() {
        super("\n" 
              + "\n----------------------------------------------"
              + "\n| Move Locations Menu"
              + "\n----------------------------------------------"
              + "\nP - Return to a previosly visited location"
              + "\nN - Go to a new location"
              + "\nQ - Exit Change Locations Menu" 
              + "\n----------------------------------------------");  
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "P":
                this.mapGetVisited();
                break;
            case "N":
                this.mapGetUnvisited();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid option: Please select an option from the Move Locations Menu.");
                break;
        }
        return false;
    }
//  Unlike the mapGetVisited() function in the MapView when this version of the function is called it will allow the user to select a location to move to.
    @Override
      protected void mapGetVisited() {
        this.console.println("*** mapGetVisited function in the MoveLocations Class called ***");
    }
//  Unlike the mapGetUnvisited() function in the MapView when this version of the function is called it will allow the user to select a location to move to.
    @Override
    protected void mapGetUnvisited() {
        this.console.println("*** mapGetUnvisited function in the MoveLocations Class called ***");
    }

}
