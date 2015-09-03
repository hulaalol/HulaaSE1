package de.hdm_stuttgart.mi.sd1.summingUpIntegerArray;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		//get user Input about number of values being summed up and the values itself.
		final Scanner scanner = new Scanner(System.in);

		System.out.print("How many values do you want to sum up? ");
		final int numValues = scanner.nextInt();

		
		if (numValues == 0)
		{
			System.out.println(numValues);
		}else
		{
		
		
		
		
		int sum = 0;
		int valueArray[] = new int[numValues];
		

		for (int i = 0; i < numValues; i++) {
			System.out.print("Enter value #" + (i + 1) + " of " + numValues + ": ");
			int userInput = scanner.nextInt();
			valueArray[i]= userInput;
			sum += userInput;
		}
		
		
		// create new arrayWithoutZeros having the length of valueArray except all Zeros.
		int arrayWithoutZeros[] = new int[valueArray.length - killZeros.killZerosArray(valueArray)];	
		// zeros get killed by killZerosArray-Method.
		
		
		// assign the non-Zero values of valueArray to the new arrayWithoutZeros
		int k=0;
		
		for (int i=0; i<valueArray.length;i++)
		{
			
			if (valueArray[i]==0)
			{
				
			}else {
				arrayWithoutZeros[k] = valueArray[i];
				k++;
			}
		}				

		
		
		//sort the arrayWithoutZeros in ascending order
		Arrays.sort(arrayWithoutZeros);
		
		// reverse order of arrayWithoutZeros in new arrayFinal to achieve descending order
		int arrayFinal[] = new int[arrayWithoutZeros.length];
		
		int z=0;
		for (int i = arrayWithoutZeros.length; i > 0; i--)
		{
			
			arrayFinal[i-1] = arrayWithoutZeros[z];
			z++;
		}
		
		
		
		
		if (arrayFinal.length == 1)
		{
			System.out.println(arrayFinal[0]);
		}else
		{
		
		
		
		//print index 0 of arrayFinal to Console without sign (+/-)
		System.out.print(arrayFinal[0]);
		//print values of arrayFinal to Console
		for (int i = 1; i < arrayFinal.length; i++) {
			
			if (arrayFinal[i]>0)
			{
				System.out.print("+"+arrayFinal[i]);
			} else
			{
				System.out.print(arrayFinal[i]);
			}
			
		}		
		//print Sum
		System.out.print("= " + sum);
		}
		}
	}
	
	}
