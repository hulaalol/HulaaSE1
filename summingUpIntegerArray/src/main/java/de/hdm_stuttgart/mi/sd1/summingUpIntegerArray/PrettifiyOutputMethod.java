package de.hdm_stuttgart.mi.sd1.summingUpIntegerArray;

import java.util.Arrays;

public class PrettifiyOutputMethod {

	public static String prettifiyOutput(int a[])
	{
		
		if (a.length == 0)
		{
			return "0";
		}else if (a.length == 1)
		{
			return Integer.toString(a[0]);
		}else
		{
		
		
		
		int sum = 0;
		for(int value:a)
		{
			sum +=value;
		}
		
		// create new arrayWithoutZeros having the length of valueArray except all Zeros.
		int arrayWithoutZeros[] = new int[a.length - killZeros.killZerosArray(a)];	
		// zeros get killed by killZerosArray-Method.
		
		if (arrayWithoutZeros.length == 0)
		{
			return "0";
		}else{
		
		// assign the non-Zero values of a to the new arrayWithoutZeros
		int k=0;
		
		for (int i=0; i<a.length;i++)
		{
			
			if (a[i]==0)
			{
				
			}else {
				arrayWithoutZeros[k] = a[i];
				k++;
			}
		}				

		
		int sumOfNegative = 0;
		for (int value:arrayWithoutZeros)
		{
			if (value < 0)
			{
				sumOfNegative++;
			}else
			{
				// nothing
			}
		}
		
		int sumOfPositive = arrayWithoutZeros.length - sumOfNegative;
		
		int positive [] = new int[sumOfPositive];
		int negative [] = new int[sumOfNegative];
		
		int p = 0;
		int n = 0;
		for (int value =0; value<arrayWithoutZeros.length ; value++)
		{
			if (arrayWithoutZeros[value] > 0)
			{
				positive[p] = arrayWithoutZeros[value];
				p++;
			}else
			{
				negative[n] = arrayWithoutZeros[value];
				n++;
			}
		}
		
		for(int value=0; value < positive.length; value++)
		{
			arrayWithoutZeros[value] = positive[value];
		}
		
		Arrays.sort(negative);
		int negativeSorted[] = new int[negative.length];
		int sorter = 0;
		
		for(int value=0; value < negativeSorted.length;value++)
		{
			negativeSorted[value]=negative[negative.length-1-value];
		}
		
		
		int arrayFinal[] = new int[negative.length+positive.length];
		for(int value=0; value < positive.length; value++)
		{
			arrayFinal[value]=positive[value];
		}
		for(int value=0; value<negative.length;value++)
		{
			arrayFinal[value+positive.length]=negative[value];
		}
	
		
		
		if (arrayFinal.length == 1)
		{
			String result = Integer.toString((arrayFinal[0]));
			return result;
		}else
		{
		
		
		
		StringBuffer result = new StringBuffer(100);
			
			
		//print index 0 of arrayFinal to Console without sign (+/-)
		result.append((arrayFinal[0]));
		//print values of arrayFinal to Console
		for (int i = 1; i < arrayFinal.length; i++) {
			
			if (arrayFinal[i]>0)
			{
				result.append("+");
				result.append(arrayFinal[i]);
			} else
			{
				result.append(arrayFinal[i]);
			}
			
		}		
		//print Sum
		result.append("=");
		result.append(sum);
		
		return result.toString();
		}
		}
		}



}
	
	
	
}
