package de.hdm_stuttgart.mi.sd1.summingUpIntegerArray;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		final Scanner scanner = new Scanner(System.in);

		System.out.print("How many values do you want to sum up? ");
		final int numValues = scanner.nextInt();

		int sum = 0;
		int valueArray[] = new int[numValues];
		

		for (int i = 0; i < numValues; i++) {
			System.out.print("Enter value #" + (i + 1) + " of " + numValues + ": ");
			int userInput = scanner.nextInt();
			valueArray[i]= userInput;
			sum += userInput;
		}
		

		int faggit[] = new int[killZeros.killZerosArray(valueArray)];	
		
		for (int i=0; i<valueArray.length;i++) //todo!
		{
			if (valueArray[i]==0)
			{
				
			}else {
				for (int k=0; k<2; k++)
				{
				faggit[k] = valueArray[i];
				}
			}
		}				

		
		for (int i = 0; i < faggit.length; i++) {
			System.out.print(faggit[i]);
		}									//todo
		
		
		

		if (valueArray.length==1)
		{
			System.out.print(valueArray[0]);
		}else 
		{


			for (int i = 0; i<(valueArray.length); i++)
			{

				if (valueArray[i]==0)
				{
					; //chill
				}

				if (valueArray[i]>0)
				{
					
					
					if (valueArray[i+1]==0)
					{
						System.out.print(valueArray[i]);
					} else if (i != 0)
					{
						System.out.print("+");
						System.out.print(valueArray[i]);
					}

				} else if (valueArray[i]<0){

					System.out.print(valueArray[i]);

				}

			}


			if (sum==0)
			{
				System.out.print("0");
			} else
			{
				System.out.print(" = " + sum);
				scanner.close();
			}
		}
	}
}