package de.hdm_stuttgart.mi.sd1.NonsenseGenerator;

public class Driver {

	
	
	public static void main (String[] args){
	
	PredictableSequenceGenerator test = new PredictableSequenceGenerator(new int[]{3,7,19,26});
	System.out.println(test.generateSentence(test.fixedValues));
	
	PredictableSequenceGenerator test2 = new PredictableSequenceGenerator(new int[]{6,20,7,15});
	System.out.println(test2.generateSentence(test2.fixedValues));
	
	
	for (int i=0; i<26; i++){
		RandomSequenceGenerator rtest = new RandomSequenceGenerator();
		System.out.println(rtest.generateSentence(rtest.randomValues));
	}

	
	
		
	}
	
	
	
	
	

}
