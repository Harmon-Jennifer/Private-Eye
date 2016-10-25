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
public class StartProgramView {
    
        private String promptMessage;
       
        public StartProgramView() {
            this.promptMessage = "\nPlease enter your name: ";
            this.displayBanner();
        }

    private void displayBanner() {
        System.out.println(
              "\n*****"
            + "\n*"
            + "\nThere's been a murder, and your friend's been wrongfully "
            + "\nimprisoned for it. Luckily, you're a private investigator, and "
            + "\nyou've got the skills and guts to apprehend the real killer. At "
            + "\nleast, that's what you've told everyone."
            +"\n\nTo solve this mystery, you'll walk around town, interacting "
            + "\nwith its denizens, avoiding traps, and gathering clues. If you "
            + "\nsurvive, you'll be able to formally accuse the murderer, then "
            + "\ncross your fingers that you've gathered enough evidence to land "
            + "\na conviction. Otherwise, you might be out of a job."
            + "\n\nGood luck, because this won't be easy. "
            + "\nBut then again, no one ever calls you for the easy ones."
            + "\n*"
            + "\n*****");
    }

    public void displayStartProgramView() {
        
        boolean done = false; // loop will continue until done is true
        do {
            String playersName = this.getPlayersName(); //call
            if (playersName.toUpperCase().equals("Q")) //player wants to quit
                return; //exits game
            
            done = this.doAction(playersName); //done is now true
        } while (!done); //loop ends when done is true
    }

    private String getPlayersName() { 
        System.out.println("\n*** getPlayersName() called ***");
        return "Joe";
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
    
    
}
