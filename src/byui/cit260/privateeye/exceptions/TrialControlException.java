/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.exceptions;

/**
 *
 * @author Mark
 */
public class TrialControlException extends Exception{

    public TrialControlException() {
    }

    public TrialControlException(String message) {
        super(message);
    }

    public TrialControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrialControlException(Throwable cause) {
        super(cause);
    }

    public TrialControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
