/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

import byui.cit260.privateeye.exceptions.TrialControlException;

/**
 *
 * @author User
 */
public class TrialControl {
    
    public int accuse(int evidencePercentage, int turnsTaken, int randomNum) throws TrialControlException{
        if (evidencePercentage < 0 || evidencePercentage > 100)
            throw new TrialControlException("Invalid percentage number");
        if (turnsTaken < 0 || turnsTaken > 30)
            throw new TrialControlException("Invalid number of turns");
        if (randomNum < 0 || randomNum > 100)
            throw new TrialControlException("invalid random number");
        return evidencePercentage + turnsTaken + randomNum;
    }
    
    public int getPercentage(int[] percentages)
    {
        int total = 0;
        for (int percentage : percentages){
            total += percentage;
        }
        return total;
    }
}
