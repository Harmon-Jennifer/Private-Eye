/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

/**
 *
 * @author Mark
 */
public class LoseGameView extends View{
    
    public LoseGameView(String message){
        this.displayMessage = message;
    }
    
    public LoseGameView(){
        super("\n"
                + "You have failed to apprehend the murderer,"
                + "\nand now your friend will rot in jail."
                + "\n\nGAME OVER"
                + "\n\n-----------"
                + "\n\nL) Load game"
                + "\nM) Main Menu");
        
    }
    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        
        switch (value) {
            case "L":
                this.goToLoadGame();
                break;
            case "M":
                this.goToMainMenu();
                break;
            default:
                   ErrorView.display(this.getClass().getName(),
                           "Invalid input. Select an option from the menu.");
                   break;
       }
        return false;
    }
    
    protected void goToLoadGame(){
        this.console.println("**goToLoadGame() called");
}
    protected void goToMainMenu(){
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
   
}
