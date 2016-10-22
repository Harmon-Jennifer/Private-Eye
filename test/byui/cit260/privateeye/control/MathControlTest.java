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
    
    @Test
    public void testShotDistance () {
        MathControl instance = new MathControl();
        
        System.out.println("Shot test 1");
        
        int velocity = 940;
        int acceleration = 10;
        double time = 1.5;
        double expResult = 1421;
        
        double result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 2");
        
        velocity = 940;
        acceleration = 10;
        time = 0.4;
        expResult = -1;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 3");
        
        velocity = 940;
        acceleration = 10;
        time = 2.3;
        expResult = -1;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 4");
        
        velocity = 940;
        acceleration = 51;
        time = 1.5;
        expResult = -1;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 5");
        
        velocity = 940;
        acceleration = -1;
        time = 1.5;
        expResult = -1;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 6");
        
        velocity = 200;
        acceleration = 10;
        time = 1.5;
        expResult = -1;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 7");
        
        velocity = 940;
        acceleration = 0;
        time = 0.5;
        expResult = 470;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 8");
        
        velocity = 940;
        acceleration = 50;
        time = 2.2;
        expResult = 2189;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 9");
        
        velocity = 270;
        acceleration = 0;
        time = 0.5;
        expResult = 135;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 10");
        
        velocity = 270;
        acceleration = 50;
        time = 2.2;
        expResult = 715;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 11");
        
        velocity = 1100;
        acceleration = 0;
        time = 0.5;
        expResult = 550;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Shot test 12");
        
        velocity = 1100;
        acceleration = 50;
        time = 2.2;
        expResult = 2541;
        
        result = instance.shotDistance(velocity, acceleration, time);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of answerHomework method, of class MathControl.
     */
    @Test
    public void testAnswerHomework() {
        System.out.println("answerHomework test 1");
        double lengthBaseOne = 5;
        double lengthBaseTwo = 5;
        double areaTrapezoid = 5;
        MathControl instance = new MathControl();
        double expResult = 1;
        double result = instance.answerHomework(lengthBaseOne, lengthBaseTwo, areaTrapezoid);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("answerHomework test 2");
        
        lengthBaseOne = -5;
        lengthBaseTwo = 5;
        areaTrapezoid = 5;
        expResult = -1;
        
        result = instance.answerHomework(lengthBaseOne, lengthBaseTwo, areaTrapezoid);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("answerHomework test 3");
        
        lengthBaseOne = 5;
        lengthBaseTwo = -5;
        areaTrapezoid = 5;
        expResult = -1;
        
        result = instance.answerHomework(lengthBaseOne, lengthBaseTwo, areaTrapezoid);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("answerHomework test 4");
        
        lengthBaseOne = 5;
        lengthBaseTwo = 5;
        areaTrapezoid = -5;
        expResult = -1;
        
        result = instance.answerHomework(lengthBaseOne, lengthBaseTwo, areaTrapezoid);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("answerHomework test 5");
        
        lengthBaseOne = 1;
        lengthBaseTwo = 5;
        areaTrapezoid = 5;
        expResult = 1.67;
        
        result = instance.answerHomework(lengthBaseOne, lengthBaseTwo, areaTrapezoid);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("answerHomework test 6");
        
        lengthBaseOne = 5;
        lengthBaseTwo = 1;
        areaTrapezoid = 5;
        expResult = 1.67;
        
        result = instance.answerHomework(lengthBaseOne, lengthBaseTwo, areaTrapezoid);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("answerHomework test 7");
        
        lengthBaseOne = 5;
        lengthBaseTwo = 5;
        areaTrapezoid = 1;
        expResult = 0.2;
        
        result = instance.answerHomework(lengthBaseOne, lengthBaseTwo, areaTrapezoid);
        assertEquals(expResult, result, 0.0);
    }
    
}
