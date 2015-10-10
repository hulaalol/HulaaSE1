package de.hdm_stuttgart.mi.sd1.NonsenseGenerator;

public class PredictableSequenceGenerator implements NonsenseGenerator {

	
	int[] fixedValues = new int[4];
	

	@Override
	public String generateSentence(int[] inputArray) {
		
		return("The " + NonsenseGenerator.ADJECTIVES[inputArray[0]] +" "+ NonsenseGenerator.THINGS[inputArray[1]] +" "+ NonsenseGenerator.VERBS[inputArray[2]] + " a " + NonsenseGenerator.THINGS[inputArray[3]] +".");

	}

	
	
	
	public PredictableSequenceGenerator(int[] input){
		
		int k = 0;
		for (int value : input)
		{
			fixedValues[k]=value;
			k++;
		}

	}
	




	
	
	
}
