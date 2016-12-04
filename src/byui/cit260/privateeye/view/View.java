/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import java.util.Scanner;
import privateeye.PrivateEye;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Jennifer
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    private String menu;
    
    protected final BufferedReader keyboard = PrivateEye.getInFile();
    protected final PrintWriter console = PrivateEye.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        String value;
        boolean done = false;
        do {
            this.console.println(this.displayMessage);
            value = this.getInput();
            done = this.doAction(value);
            
            /*prompt for and get players name
            String value = this.getInput();
            */if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
            
            /* do the requested action and display the next view
            done = this.doAction(value);
            */
        } while (!done); // exit view when done == true    
       
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getInput() {
        boolean valid = false; // initialize to not valid
        String selection = null;
        try {
            // while a valid name has not been retrieved 
            while (!valid) { // loop while an invalid value is entered
            
                // get the value entered from the keyboard
                selection = this.keyboard.readLine(); // get next line typed on the keyboard
                selection = selection.trim(); // trim off leading and trailing blanks
                
                if (selection.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\nInvalid value: value cannot be blank");
                    continue;
                }
                break; // end the loop
            } 
        }   catch (Exception e) {     
              ErrorView.display(this.getClass().getName(),
                      "Error reading input: " + e.getMessage());
        }    
    
        return selection; // return the value entered

    }

}