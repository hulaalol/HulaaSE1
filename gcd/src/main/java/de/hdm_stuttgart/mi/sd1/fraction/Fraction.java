package de.hdm_stuttgart.mi.sd1.fraction;
import de.hdm_stuttgart.mi.sd1.gcd.Math;


public class Fraction {

	public static String BuildFraction(long a, long b) {
		
		long divisor = Math.getGCD(a, b);
		
		long fractionZähler= a/divisor;
		long fractionNenner= b/divisor;
		
		if (fractionNenner!=1){
		
		String Fraction = fractionZähler + "/" + fractionNenner;
		
		return Fraction;
		}else {
			String Fraction = fractionZähler +"";
			
			return Fraction;
		}
	}
	
	
	
	
}
