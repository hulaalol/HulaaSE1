package de.hdm_stuttgart.mi.sd1.NonsenseGenerator;

public class RandomSequenceGenerator implements NonsenseGenerator{
	
	int[] randomValues = new int[4];
	
	public RandomSequenceGenerator(){
		
		int[] rnd = generateRandomArray();
		
		for (int i = 0; i<4;i++){
		randomValues[i]=rnd[i];
		
		}
	}
	
	private static int showRandomInteger(int start, int end){
		
		int random = (int) (Math.random()*(end-start+1))+start;
		return random;
	
	  }
	
	
	public static int[] generateRandomArray() {
		
		int[] rndArray = new int[4];
		
		// adjective
	    int ENDadjective = NonsenseGenerator.ADJECTIVES.length-1;
	    rndArray[0] = showRandomInteger(0, ENDadjective);
		
		// thing
	    int k = 1;
	    for (int i = 2; i>0; i--)
	    {
	    int ENDthing = NonsenseGenerator.THINGS.length-1;
	    rndArray[k] = showRandomInteger(0, ENDthing);
	    k+=2;
	    }
	    
		// verb
	    int ENDverb = NonsenseGenerator.VERBS.length-1;
	    rndArray[2] = showRandomInteger(0, ENDverb);
	    return rndArray;
	}

	@Override
	public String generateSentence(int[] inputArray) {
		
		return("The " + NonsenseGenerator.ADJECTIVES[inputArray[0]] +" "+ NonsenseGenerator.THINGS[inputArray[1]] +" "+ NonsenseGenerator.VERBS[inputArray[2]] + " a " + NonsenseGenerator.THINGS[inputArray[3]] +".");

}
	
	
}
