/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.exceptions;

/**
 *
 * @author Konkles
 */
public class MathControlException extends Exception {

    public MathControlException() {
    }

    public MathControlException(String message) {
        super(message);
    }

    public MathControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MathControlException(Throwable cause) {
        super(cause);
    }

    public MathControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
