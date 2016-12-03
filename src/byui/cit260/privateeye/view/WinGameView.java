/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

/**
 *
 * @author Jennifer
 */
public class WinGameView extends View{
    
    public WinGameView(String message){
        this.displayMessage = message;
    }
    
    public WinGameView(){
        super("\n"
                + "You did it!"
                + "\nYou have discovered the killer, put him behind bars,"
                + "\nand your friend has been freed from prison."
                + "\n"
                + "\n\nYOU WIN!!!"
                + "\n\n-----------"
                + "\n\nL) Load Game"
                + "\nQ) Quit to Main Menu");
        
    }
    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        
        switch (value) {
            case "L":
                this.goToLoadGame();
                break;
            case "Q":
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