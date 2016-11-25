/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class HomeworkView {
    
    private String menu;
    
    private void HomeworkView(){
        System.out.println("\nA Dumb Kid approaches, and offers help on the case "
                + "if you'll help him with his homework. \nDespite your better"
                + " judgment, you agree to help the Dumb Kid."
                + "\nThe Dumb Kid smiles, and explains that he has"
                + " to find the area of a trapezoid.");
        this.menu = "\n\na = 2\nb = 4\nh = 3"
                + "\nA = (a+b)/2 * h"
                + "\n\nInput the area of the trapezoid (or E to back out): ";
    }

    void displayHomeworkView() {
        this.HomeworkView();
        boolean done = false; // loop will continue until done is true
        do {
            String menuOption = this.getAnswer(); //call
            if (menuOption.toUpperCase().equals("E")) //player wants to quit
            {
                System.out.println("The Dumb Kid's heart breaks as you walk away without a word.");
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
                        + "\nThe Dumb Kid waits for you to actually say something.");
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
        
        try {
        int menuCheck = Integer.parseInt(menuOption);
        } catch (NumberFormatException nf){
            System.out.println("\nYou must enter a valid number. Try again or"
                    + "press E to quit./n");
        }
        int input = Integer.parseInt(menuOption);
        
        if (input == 9){
            System.out.println("The answer is correct."
                    + "\nThe Dumb Kid smiles and gives you a clue."
                    + " Huzzah.");
            return true; //ends view and returns to previous menu
        }
        else{
            System.out.println("The answer is incorrect. "
                    + "\nThe Dumb Kid screams"
                    + " and runs off into an alley, never to be seen again.");
            return true; //ends view and returns to previous menu
        }
    }
   
}
