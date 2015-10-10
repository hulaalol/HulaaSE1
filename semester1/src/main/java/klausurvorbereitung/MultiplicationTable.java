package klausurvorbereitung;

public class MultiplicationTable {
	
	
	public static void main (String [] args)
	{
		
		// table head
		
		for (int i = 0; i<21; i++)
		{
			
		if (i==0)
		{
			System.out.print("  |");
		}else
		{
			System.out.format("%3d   ",i);
		}	
		}
		
		System.out.print("\n");
		System.out.println("--+------------------------------------------------------------------------------------------------------------------------------");
		
		int rowNumber = 1;
		for(int i=1; i<21; i++)
		{
			if (i>1)
			{
				System.out.print("\n");	
			}
			
			System.out.format("%2d|", rowNumber);
			rowNumber++;
			
			for(int k=1; k<21; k++)
			{
				System.out.format("%3d   ", i*k);	
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
