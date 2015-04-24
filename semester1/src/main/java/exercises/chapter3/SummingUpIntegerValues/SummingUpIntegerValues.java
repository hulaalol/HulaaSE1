package exercises.chapter3.SummingUpIntegerValues;

/**
 * Hello world!
 *
 */
public class SummingUpIntegerValues 
{

	
	public static int getSum(int limit)
	{
		int sum = 0;
		for ( ; limit>0; limit--)
		{
		sum += limit;
		}
		return sum;
	}
	
    public static void main( String[] args )
    {
        System.out.println( getSum(150) );
    }
}
