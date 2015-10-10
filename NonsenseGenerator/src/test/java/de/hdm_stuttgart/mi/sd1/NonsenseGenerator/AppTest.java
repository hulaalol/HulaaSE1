package de.hdm_stuttgart.mi.sd1.NonsenseGenerator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  
	
	int[] test1 = {3,7,19,26};
	int[] test2 = {6,20,7,15};
	
	
	
	
    @Test
    public void testApp() {
    	   Assert.assertEquals("The gray cat threatens a dog.", 
    		         new PredictableSequenceGenerator(test1).generateSentence(test1));
    		   Assert.assertEquals("The friendly lawyer meets with a physicist.", 
    				   new PredictableSequenceGenerator(test2).generateSentence(test2));
    }
}
