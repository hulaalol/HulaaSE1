package exercises.chapter2.MultiplicationTables;
import java.util.Scanner;

public class MultiplicationTable_V3 {
	
	

		public static void main(String[] args) 
		{

			final Scanner scan = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
			System.out.print("Multiplication Table: Enter range= ");
			final int tableSize = scan.nextInt();
			
			

			System.out.print("     ");
			for (int row = 1; row <= tableSize; row++) {

				System.out.format("%5d", row);

			}
			System.out.print("\n");
			System.out
			.print("----+-----------------------------------------------------------------------------------------------------");

			for (int row = 1; row - 1 < tableSize; row++) {
				System.out.print("\n");
				for (int col = 1; col <= row; col++) {
					if (col == 1) {
						System.out.format("%4d", row);
						System.out.print("|");

					}
					if (col >= 1) {
						System.out.format("%5d", (row * col));
					}

				}
			}
		}

	}



