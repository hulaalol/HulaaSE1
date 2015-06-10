package de.hdm_stuttgart.mi.sd1.summingUpIntegerArray;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		final Scanner scanner = new Scanner(System.in);

		System.out.print("How many values do you want to summ up? ");
		final int numValues = scanner.nextInt();

		int sum = 0;
		int valueArray[] = new int[numValues];

		for (int i = 0; i < numValues; i++) {
			System.out.print("Enter value #" + (i + 1) + " of " + numValues + ": ");
			int userInput = scanner.nextInt();
			valueArray[i]= userInput;
			sum += userInput;
		}

		for (int i = 0; i<(valueArray.length); i++)
		{
			
			if (valueArray[i]>=0)
			{
				
				if (i != 0)
				{
					System.out.print("+");
				}
				System.out.print(valueArray[i]);
				
			} else {
				
				System.out.print(valueArray[i]);
				
			}

		}
		System.out.print(" = " + sum);
		scanner.close();
	}
}