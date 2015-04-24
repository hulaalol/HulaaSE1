package exercises.chapter2.ChristmasTree;

import java.util.Scanner;

public class PrintingChristmasTree_V3 {

	public static void main(String[] args) {

		final Scanner scan = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
		System.out.print("Enter tree height: ");
		final int numberOfRows = scan.nextInt();

		for (int actualRow = 0; actualRow <= numberOfRows; actualRow++) {         			// Main-Loop. ActualRow= The row currently being printed. NumberOfRows = User Input

			int numberOfSigns = ((numberOfRows * 2) - 1);  									// How many signs are placed in EVERY line (stays the same)
			int numberOfX = ((actualRow * 2) - 1);											// How many * will be printed in this iteration
			int numberOfSpace = ((numberOfSigns - numberOfX) / 2);							// How many Spaces will be printed in this iteration

			if (actualRow == 0) { 															//If the first row is printed there will be a unicodee-xmas-star (only in first iteration)
				for (int printSpaceForStar = numberOfSpace - 1; (printSpaceForStar) >= 0; printSpaceForStar--) {
					if (printSpaceForStar == 0) {
						System.out.print("\u2606");
					}
					System.out.print(" ");
				}
			}

			if (actualRow > 0) { 															// Any further iterations start in a new line! Executed every iteration except first one!
				System.out.print("\n");
			}

			for (int printX = numberOfX; printX > 0; printX--) {  							//Loop for printing *

				for (int printSpace = numberOfSpace; numberOfSpace > 0; numberOfSpace--) { 	// Loop for printing Spaces
					System.out.print(" ");
				}

				System.out.print("*"); 														// * only printed when Loop for printing Spaces has finished

			}

			for (int stamm = numberOfRows/4; (actualRow == numberOfRows) && (stamm > 0); stamm--) {		// If acutalRow==numberOfRows, it is the last iteration
				
				int stammDicke= (numberOfSigns/4);
				
																											//After the last iteration, execute two iterations of this loop
				System.out.print("\n"); 																	//Go in a new line for the first and second line of tree trunk
				for (int printSpaceForStamm = ((numberOfSigns-stammDicke)/2); printSpaceForStamm > 0; printSpaceForStamm--) {
																											//Loop to detect how many Spaces are needed before the trunk begins (numberOfSigns/2)
					System.out.print(" ");
				}
				
				for (; stammDicke > 0 ; stammDicke--) 
				{
					System.out.print("#");	
				}
				
															//After every Trunk-Spaces-Loop the trunk is printed
			}

		}

	}

}
