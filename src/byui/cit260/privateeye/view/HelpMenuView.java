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
public class HelpMenuView extends View{
    
    public HelpMenuView() {
        super("\n" 
                  + "\n----------------------------------------------"
                  + "\n| Help Menu                                  |"
                  + "\n----------------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move."
                  + "\nI - How to interact with people and objects."
                  + "\nA - How to accuse a suspect."
                  + "\nE - Exit Help menu."
                  + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "G":
                this.helpGameGoal();
                break;
            case "M":
                this.helpMove();
                break;
            case "I":
                this.helpInteract();
                break;
            case "A":
                this.helpAccuse();
                break;
            default:
                System.out.println("\nInvalid option: Please select an option from the Help Menu.");
                break;
        }
        return false;
    }
   
    private void helpGameGoal() {
        System.out.println("*** helpGameGoal function called ***");
    }

    private void helpMove() {
        System.out.println("*** helpMove function called ***");
    }

    private void helpInteract() {
        System.out.println("*** helpInteract function called ***");
    }

    private void helpAccuse() {
        System.out.println("*** helpAccuse function called ***");
    }    
}
