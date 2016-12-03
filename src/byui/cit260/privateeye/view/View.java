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
        
        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); // exit view when done == true    
       
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getInput() {
        boolean valid = false; // initialize to not valid
        String value = null;
        try {
            // while a valid name has not been retrieved 
            while (!valid) { // loop while an invalid value is entered
            
                // get the value entered from the keyboard
                value = this.keyboard.readLine(); // get next line typed on the keyboard
                value = value.trim(); // trim off leading and trailing blanks
            
                if (value.length() < 1) { // value is blank
                    System.out.println("\nInvalid value: value can not be blank");
                    continue;
                }
                break; // end the loop
            } 
        }   catch (Exception e) {     
              System.out.println("Error reading input: " + e.getMessage());
        }    
    
        return value; // return the value entered

    }

}