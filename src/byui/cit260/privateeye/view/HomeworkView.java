/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import privateeye.PrivateEye;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Mark
 */
public class HomeworkView extends View {

    private String menu;

    private void HomeworkView() {
        this.console.println("\nA Dumb Kid approaches, and offers help on the case "
                + "if you'll help him with his homework. \nDespite your better"
                + " judgment, you agree to help the Dumb Kid."
                + "\nThe Dumb Kid smiles, and explains that he has"
                + " to find the area of a trapezoid.");
        this.menu = "\n\na = 2\nb = 4\nh = 3"
                + "\nA = (a+b)/2 * h"
                + "\n\nInput the area of the trapezoid (or E to back out): ";
    }

    void displayHomeworkView() throws IOException {
        this.HomeworkView();
        boolean done = false; // loop will continue until done is true

        do {
            String menuOption = this.getAnswer(); //call
            if (menuOption.toUpperCase().equals("E")) //player wants to quit
            {
                this.console.println("The Dumb Kid's heart breaks as you walk away without a word.");
                return; //exits game
            }

            done = this.doAction(menuOption); //done is now true

        } while (!done); //loop ends when done is true
    }

    private String getAnswer() throws IOException {

        String menuOption = "";
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + this.menu);

            menuOption = this.keyboard.readLine(); // get next line typed on the keyboard
            menuOption = menuOption.trim(); // trim off leading and trailing blanks

            if (menuOption.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value: value can not be blank"
                        + "\nThe Dumb Kid waits for you to actually say something.");
                continue;
            }

            break; // end the loop
        }
        return menuOption; // return the value entered
    }

    @Override
    public boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase();
        if (menuOption.equals("E")) {
            return true; //return to previous menu
        }
        try {
            int menuCheck = Integer.parseInt(menuOption);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number. Try again or"
                    + "press E to quit./n");
        }
        int input = Integer.parseInt(menuOption);

        if (input == 9) {
            this.console.println("The answer is correct."
                    + "\nThe Dumb Kid smiles and gives you a clue."
                    + " Huzzah.");
            return true; //ends view and returns to previous menu
        } else {
            this.console.println("The answer is incorrect. "
                    + "\nThe Dumb Kid screams"
                    + " and runs off into an alley, never to be seen again.");
            return true; //ends view and returns to previous menu
        }
    }

}
