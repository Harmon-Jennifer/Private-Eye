/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

/**
 *
 * @author User
 */
public class TrialControl {
    
    public int accuse(int evidencePercentage, int turnsTaken, int randomNum) {
        if (evidencePercentage < 0 || evidencePercentage > 100)
            return -1;
        if (turnsTaken < 0 || turnsTaken > 30)
            return -1;
        if (randomNum < 0 || randomNum > 100)
            return -1;
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
