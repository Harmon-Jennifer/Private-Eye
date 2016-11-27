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
public class ListControlException extends Exception {

    public ListControlException() {
    }

    public ListControlException(String message) {
        super(message);
    }

    public ListControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListControlException(Throwable cause) {
        super(cause);
    }
    
    
}
