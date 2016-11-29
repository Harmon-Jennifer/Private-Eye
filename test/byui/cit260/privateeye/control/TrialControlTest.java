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
public class TrialControlTest {
    
    public TrialControlTest() {
    }

    /**
     * Test of accuse method, of class TrialControl.
    
    @Test
    public void testAccuse() {
        System.out.println("accuse 1");
        int evidencePercentage = 5;
        int turnsTaken = 5;
        int randomNum = 5;
       TrialControl instance = new TrialControl();
        int expResult = 15;
        int result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("accuse 2");
        evidencePercentage = 102;
        turnsTaken = 5;
        randomNum = 5;
        
        expResult = -1;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 3");
        evidencePercentage = 5;
        turnsTaken = -3;
        randomNum = 5;
        
        expResult = -1;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 4");
        evidencePercentage = 5;
        turnsTaken = 5;
        randomNum = 111;
        
        expResult = -1;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 5");
        evidencePercentage = 100;
        turnsTaken = 5;
        randomNum = 5;
        
        expResult = 110;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 6");
        evidencePercentage = 0;
        turnsTaken = 5;
        randomNum = 5;
        
        expResult = 10;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 7");
        evidencePercentage = 5;
        turnsTaken = 30;
        randomNum = 5;
        
        expResult = 40;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 8");
        evidencePercentage = 5;
        turnsTaken = 0;
        randomNum = 5;
        
        expResult = 10;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 9");
        evidencePercentage = 5;
        turnsTaken = 5;
        randomNum = 0;
        
        expResult = 10;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
        
        System.out.println("accuse 10");
        evidencePercentage = 5;
        turnsTaken = 5;
        randomNum = 100;
        
        expResult = 110;
        result = instance.accuse(evidencePercentage, turnsTaken, randomNum);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPercentage method, of class TrialControl.
     */
    @Test
    public void testGetPercentage() {
        System.out.println("getPercentage 1");
        int[] percentages = {3,2,1};
        TrialControl instance = new TrialControl();
        int expResult = 6;
        int result = instance.getPercentage(percentages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
