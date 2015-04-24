package exercises.chapter2.ChristmasTree;

public class PrintingChristmasTree_V1 {

	public static void main(String[] args) {
		
		
		int numberOfRows = 10;
		
		for (int actualRow=0; actualRow <= numberOfRows ; actualRow++ )
		{
		
		int numberOfSigns = ((numberOfRows*2)-1);
		int numberOfX = ((actualRow*2)-1);
		int numberOfSpace = ((numberOfSigns - numberOfX)/2);
		
		if (actualRow > 0)
		{
		System.out.print("\n");
		}
		
		
				for (int printX = numberOfX; printX > 0 ; printX-- )
				{
					
						for (int printSpace = numberOfSpace; numberOfSpace > 0 ; numberOfSpace-- )
						{
						System.out.print(" ");
						}
			
					System.out.print("*");
				}
		
		
		

		
		
		
		
		}
		
		

}
}
