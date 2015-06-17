package de.hdm_stuttgart.mi.sd1.summingUpIntegerArray;

public class killZeros {
	
	public static int killZerosArray(int a[])
	{
		int numberOfZeros = 0;
		
		for (int i = 0; i<a.length; i++)
		{
			if (a[i]==0)
			// if the value of the array at index i == 0, count +1 to numberOfZeros .
			{
				numberOfZeros++;
			}else
			{
			// if the value of the array at index i !=0, do nothing.
			}
	}	
		return numberOfZeros;
}
}



	
	
	

