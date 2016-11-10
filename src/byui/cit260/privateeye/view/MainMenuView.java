/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;
import byui.cit260.privateeye.control.GameControl;
import privateeye.PrivateEye;

/**
 *
 * @author User
 */
public class MainMenuView extends View {
    
     public MainMenuView() {
         super("\n" 
                  + "\n----------------------------------------------"
                  + "\n| Main Menu                                  |"
                  + "\n----------------------------------------------"
                  + "\nN - Start new game"
                  + "\nS - Save game"
                  + "\nL - Load saved game"
                  + "\nH - Help menu"
                  + "\nQ - Quit"
                  + "\n----------------------------------------------");
    }
     
    /**
     *
     * @param value
     * @return
     */
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.helpMenu();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Main Menu.");
                break;
        }
        return false;
    }
    
    private void startNewGame() {
       GameControl.createNewGame(PrivateEye.getPlayer());
       
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayGameMenu();
    }
    
    private void saveGame() {
       System.out.println("*** saveGame function called ***");
    }
    
    private void loadSavedGame() {
       System.out.println("*** loadSavedGame function called ***");
    }
    
    private void helpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       
       helpMenuView.displayHelpMenuView();
    }
    
    
    
    
    
}
