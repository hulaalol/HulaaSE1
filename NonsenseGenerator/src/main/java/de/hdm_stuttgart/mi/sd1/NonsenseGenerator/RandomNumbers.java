package de.hdm_stuttgart.mi.sd1.NonsenseGenerator;

import java.util.Random;

public class RandomNumbers implements NonsenseGenerator{
	
	private static int showRandomInteger(int aStart, int aEnd, Random aRandom){
	    if (aStart > aEnd) {
	      throw new IllegalArgumentException("Start cannot exceed End.");
	    }
	    //get the range, casting to long to avoid overflow problems
	    long range = (long)aEnd - (long)aStart + 1;
	    // compute a fraction of the range, 0 <= frac < range
	    long fraction = (long)(range * aRandom.nextDouble());
	    int randomNumber =  (int)(fraction + aStart);  
	    return randomNumber;
	  }
	
	
	public static int[] generateRandomArray() {
		
		int start = 0;
		int[] rndArray = new int[4];
		
		// adjective
	    int ENDadjective = NonsenseGenerator.ADJECTIVES.length-1;
	    Random arandom = new Random();
	    rndArray[0] = showRandomInteger(start, ENDadjective, arandom);
		
		// thing
	    
	    
	    int k = 1;
	    for (int i = 2; i>0; i--)
	    {
		int STARTthing = 0;
	    int ENDthing = NonsenseGenerator.THINGS.length-1;
	    Random brandom = new Random();
	    
	    rndArray[k] = showRandomInteger(start, ENDthing, brandom);
	    k+=2;
	    }
	    
		// verb
		int STARTverb = 0;
	    int ENDverb = NonsenseGenerator.VERBS.length-1;
	    Random crandom = new Random();
	    rndArray[2] = showRandomInteger(start, ENDverb, crandom);
	    
	    return rndArray;
	}

	
	public static String generateSentence(int[] inputArray) {
		
		return("The " + NonsenseGenerator.ADJECTIVES[inputArray[0]] +" "+ NonsenseGenerator.THINGS[inputArray[1]] +" "+ NonsenseGenerator.VERBS[inputArray[2]] + " a " + NonsenseGenerator.THINGS[inputArray[3]] +".");

}
	
	
}
