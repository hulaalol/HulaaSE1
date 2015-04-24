package exercises.chapter2.ChristmasTree;

import java.util.Scanner;

public class PrintingChristmasGoodTree_V2 {

	public static void main(String[] args) {
		
		final Scanner scan = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
		System.out.print("Enter tree height: ");
		final int numberOfRowsUser = scan.nextInt();
		final int numberOfRows = numberOfRowsUser/2 +3;  //handle the double iterations
		
		// Build Top
		
		for (int printSpaces=0; printSpaces < numberOfRows-1 ; printSpaces++ )
		{
			System.out.print(" ");
		}
		System.out.print("\\ /");
		System.out.print("\n");
		
		for (int printSpaces=0; printSpaces < numberOfRows-3 ; printSpaces++ )
		{
			System.out.print(" ");
		}
		System.out.print("-->*<--");
		System.out.print("\n");
		
		for (int printSpaces=0; printSpaces < numberOfRows-1 ; printSpaces++ )
		{
			System.out.print(" ");
		}
		System.out.print("/_\\");
		System.out.print("\n");

		for (int printSpaces=0; printSpaces < numberOfRows-2 ; printSpaces++ )
		{
			System.out.print(" ");
		}
		System.out.print("/_\\_\\");
		
		
		// Build Middle
		
		
		for (int actualRow=4; actualRow<=numberOfRows; actualRow++)
		{
		
		for (int loop=0 ;loop<2; loop++)
		{
			System.out.print("\n");
			for (int printSpaces= numberOfRows-actualRow; printSpaces >=0 ; printSpaces-- )
			{
				System.out.print(" ");
			}
			
			System.out.print("/");
			
			if(loop==0)
			{
			for (int printRowSigns = (((actualRow*2)-1)/2) ; printRowSigns >1 ; printRowSigns--)
			{
			System.out.print("_/");	
			}
			System.out.print("_\\");	
			}
			if(loop==1)
			{
				for (int printRowSigns = (((actualRow*2)-1)/2) ; printRowSigns >1 ; printRowSigns--)
				{
				System.out.print("_\\");	
				}
				System.out.print("_\\");		
			}
			
		}	
	}
		// Build Trunk
		
		
		
		for (int trunkLength= numberOfRows/2; trunkLength>0 ; trunkLength--)
		{
		System.out.print("\n");
		
		for (int printSpaces= ((numberOfRows*2)-1)/2 - (((numberOfRows/2) -2)/2)  ; printSpaces >=0 ; printSpaces-- )
		{
			System.out.print(" ");
		}
		System.out.print("[");
		for (int trunkWidth= (numberOfRows/2) -2   ;  trunkWidth>0 ; trunkWidth--)
		{
		System.out.print("=");	
		}
		System.out.print("]");
		}

}
}
