package de.hdm_stuttgart.mi.sd1.NonsenseGenerator;

import java.util.Random;


public interface NonsenseGenerator{
	
	 static final String[] ADJECTIVES = {
	      "red",       "green",    "yellow",     "gray",        "solid",   // Index 4
	      "fierce",    "friendly", "cowardly",   "convenient",  "foreign", // Index 9
	      "national",  "tall",     "short",      "metallic",    "golden",  // Index 14
	      "silver",    "sweet",    "nationwide", "competitive", "stable",  // Index 19
	      "municipal", "famous" };                                         // Index 21

	   static final String[] THINGS = { 
	      "elephant",   "bowl",    "brick",  "spoon",   "bunny",    // Index 4
	      "watermelon", "car",     "cat",    "cup",     "desk",     // Index 9
	      "tangerine",  "duck",    "bottle", "road" ,   "fork",     // Index 14
	      "physicist",  "griffon", "hat",    "key",     "knife",    // Index 19
	      "lawyer",     "llama",   "manual", "meat",    "monitor",  // Index 24
	      "mouse",      "dog",     "paper",  "pear",    "pen",      // Index 28
	      "pencil",     "phone",   "glass",  "planet",  "potato",   // Index 34
	      "engineer",   "salad",   "shoe",   "slipper", "soup",     // Index 39
	      "building",   "star",    "steak",  "table",   "terminal", // Index 44
	      "treehouse",  "truck",   "cake",   "window" };            // Index 48

	   static final String[] VERBS = {
	      "plans cease fire against",  "expected to sell", "expected to buy", "speaks to", "leases",    // Index 4
	      "signs partnership with",    "advances towards", "meets with",      "seen with", "sells",     // Index 9
	      "is authorized to sell",     "signs truce with", "converts into",   "buys",      "rents",     // Index 14
	      "allegedly speaks to",       "collapses on",     "invests on",      "warns",     "threatens", // Index 19
	      "reported to have met with", "now manages",      "starts war with", "accuses",   "becomes" ,  // Index 24
	      "works together with" };                                                                      // Index 25
    

	   public static String generateSentence(int[] inputArray) {
		return null; 
		}
			
		
	   
}



