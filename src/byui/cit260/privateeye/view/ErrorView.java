/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import java.io.PrintWriter;
import privateeye.PrivateEye;

/**
 *
 * @author Konkles
 */
public class ErrorView {
    private static final PrintWriter errorFile = PrivateEye.getOutFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
                    "--------------------------------------------------------"
                   +"\n- ERROR - "+errorMessage
                   +"\n--------------------------------------------------------");
    }
}
