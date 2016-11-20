/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class BunnyView {
    
    private String menu;
    
    private void BunnyView(){
        
        System.out.println("\nThere's an odd-looking man in a tweed jacket. He's "
                + "carrying a burlap sack and muttering something. You approach "
                + "him and ask about the murder. He laughs. Then says, he'll "
                + "help you, but first you must answer his math riddle correctly. "
                + "\nThere is something off and omonious about this man, but"
                + " you agree to his terms."
                + "\nThe Mad Math Genius smiles, and explains that he has 5" 
                + " brown bunnies and 5 black bunnies in his sack. He asks you if"
                + " you pull a brown bunny from the sack and throw it. What is the "
                + "percent chance that that the next bunny you pull will be a black bunny?"
                + "\n5 / (5 + 5) - 1 = ? "
                + "\nenter your answer:");
    }

    void displayBunnyView() {
        this.BunnyView();
        boolean done = false; // loop will continue until done is true
        do {
            String menuOption = this.getAnswer(); //call
            if (menuOption.toUpperCase().equals("E")) //player wants to quit
            {
                System.out.println("You can't leave, shouts the Mad Math Genius as he stabs you in the back.");
                return; //exits game
            }
            
            done = this.doAction(menuOption); //done is now true
            
        } while (!done); //loop ends when done is true
    }

    private String getAnswer() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String menuOption = "";
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
            menuOption = keyboard.nextLine(); // get next line typed on the keyboard
            menuOption = menuOption.trim(); // trim off leading and trailing blanks
            
            if (menuOption.length() < 1 ) { // value is blank
                System.out.println("\nInvalid value: value can not be blank"
                        + "\nThe Mad Math Genius stares anxiously at you.");
              continue;
            }
            
            break; // end the loop
        }                                
        return menuOption; // return the value entered
    }

    private boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase();
        if (menuOption.equals("E"))
            return true; //return to previous menu
        
        double input = Double.parseDouble(menuOption);
        
        if (input == 50){
            System.out.println("The answer is correct."
                    + "\nThe Mad Math Genius looks pleased."
                    + " He hands you a new clue.");
            return true; //ends view and returns to previous menu
        }
        else{
            System.out.println("The answer is incorrect. "
                    + "\nThe Mad Math Genius flies into a rage."
                    + " He kills you. Was he the killer? Who knows."
                    + "\n **** GAME OVER ****"
                    + "\n Just kidding it was all a dream and you just woke up. Or did you?");
            return true; //ends view and returns to previous menu
        }
    }
   
}
