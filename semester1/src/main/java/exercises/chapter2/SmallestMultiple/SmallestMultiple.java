package exercises.chapter2.SmallestMultiple;

public class SmallestMultiple {

		public static void main(String[] args) {
			
			
			double divisor=20;
			
			
			calculation:
			for (double candidate = (double)divisor; candidate%divisor>=0; candidate++  )
			{
				
				for (double div=(double) divisor ;candidate%div==0; div--)
				{
					if(div==1)
					{
						System.out.format("%9.0f" ,candidate);
						break calculation;
					}
				}
			}
			
			
			

			
					
					
			
			
		}
			
			

		

	}



