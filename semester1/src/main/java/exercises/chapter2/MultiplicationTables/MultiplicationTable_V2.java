package exercises.chapter2.MultiplicationTables;

public class MultiplicationTable_V2 {


	public static void main(String[] args) {
		
		int tableSize =20;
		
		System.out.print("     ");
		
		for (int row=1; row <= tableSize; row++)
		{
			
			System.out.format("%5d",row);
			
		}
		System.out.print("\n");
		System.out.print("-----+-----------------------------------------------------------------------------------------------------");
		
			for (int row=1 ; row-1<tableSize; row++ )
			{
				System.out.print("\n");
				for (int col=1; col<=tableSize ; col++)
				{
					if (col==1)
					{
						System.out.format("%4d",row);
						System.out.print("|");
					}
					System.out.format("%5d",row*col);
					
				}
			}
		}

	}



	

