/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

/**
 *
 * @author Mark
 */
public class MathControl {
    
    public double answerBunny(int brownBunny, int blackBunny)
    {
        if (blackBunny < 1 || blackBunny > 10)
            return -1;
        if (brownBunny < 1 || brownBunny > 10)
            return -1;
        double answer = blackBunny / (blackBunny + brownBunny - 1.00);   
        return Math.round(answer*100)/100.0;
    }
}
