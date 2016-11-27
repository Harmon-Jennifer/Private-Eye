/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

import byui.cit260.privateeye.exceptions.ListControlException;

/**
 *
 * @author User
 */
public class ListControl {
    
    public int getInput(int test) throws ListControlException{
    if (test < 0)
            throw new ListControlException("\nFlagrant error. Virus equals very yes.\n");
    return test;
}
}
