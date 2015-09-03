package de.hdm_stuttgart.mi.sd1.summingUpIntegerArray;

import java.util.Scanner;

public class Driver2 {

	
	public static void main (String[] args)
	{
		//get user Input about number of values being summed up and the values itself.
		final Scanner scanner = new Scanner(System.in);

		System.out.print("How many values do you want to sum up? ");
		final int numValues = scanner.nextInt();

		
		if (numValues == 0)
		{
			System.out.println(numValues);
		}else
		{
		
		int valueArray[] = new int[numValues];
		

		for (int i = 0; i < numValues; i++) {
			System.out.print("Enter value #" + (i + 1) + " of " + numValues + ": ");
			int userInput = scanner.nextInt();
			valueArray[i]= userInput;
		
		}
		System.out.println(PrettifiyOutputMethod.prettifiyOutput(valueArray));
		
		}
	}
}
	

