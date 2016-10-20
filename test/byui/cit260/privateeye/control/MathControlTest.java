/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mark
 */
public class MathControlTest {
    
    public MathControlTest() {
    }

    /**
     * Test of answerBunny method, of class MathControl.
     */
    @Test
    public void testAnswerBunny() {
        System.out.println("Test Case 1");
        int brownBunny = 5;
        int blackBunny = 5;
        MathControl instance = new MathControl();
        double expResult = 0.56;
        double result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 2");
        brownBunny = 0;
        blackBunny = 5;
        
        expResult = -1.0;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 3");
        brownBunny = 5;
        blackBunny = 0;
        
        expResult = -1.0;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 4");
        brownBunny = 500;
        blackBunny = 5;
        
        expResult = -1.0;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 5");
        brownBunny = 5;
        blackBunny = 500;
        
        expResult = -1.0;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 6");
        brownBunny = 1;
        blackBunny = 5;
        
        expResult = 1.0;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 7");
        brownBunny = 5;
        blackBunny = 1;
        
        expResult = 0.2;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 8");
        brownBunny = 10;
        blackBunny = 5;
        
        expResult = 0.36;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Case 9");
        brownBunny = 5;
        blackBunny = 10;
        
        expResult = 0.71;
        result = instance.answerBunny(brownBunny, blackBunny);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
