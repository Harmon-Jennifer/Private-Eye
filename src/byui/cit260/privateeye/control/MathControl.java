/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

import byui.cit260.privateeye.exceptions.MathControlException;

/**
 *
 * @author Mark
 */
public class MathControl {

    public double answerBunny(int brownBunny, int blackBunny) throws MathControlException {
        //return percentage of black bunnies
        if (blackBunny < 1 || blackBunny > 10) {
            return -1;
        }
        if (brownBunny < 1 || brownBunny > 10) {
            return -1;
        }
        double answer = blackBunny / (blackBunny + brownBunny - 1.00);
        return Math.round(answer * 100) / 100.0; //rounds answer to two decimal places
    }

    //Distance (d), velocity(v), acceleration (a), time (t)
    public double shotDistance(int v, int a, double t) {
        if (a < 0 || a > 50) {
            return -1;
        }
        if (t < 0.5 || t > 2.2) {
            return -1;
        }
        if (v == 270 || v == 940 || v == 1100) {
            double d;
            // Calculates the distance the bullet travels
            d = ((v * t) + (0.5 * a * t * t));
            return Math.round(d);
        } else {
            return -1;
        }
    }

    public double answerHomework(double lengthBaseOne, double lengthBaseTwo, double areaTrapezoid) {
        //return height of the trapezoid

        if (lengthBaseOne <= 0 || lengthBaseTwo <= 0 || areaTrapezoid <= 0) {
            return -1;
        }
        double heightTrapezoid = 2 * areaTrapezoid / (lengthBaseOne + lengthBaseTwo);
        return Math.round(heightTrapezoid * 100) / 100.0; //rounds answer to two decimal places
    }

}
