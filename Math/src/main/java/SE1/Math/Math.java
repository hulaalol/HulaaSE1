package SE1.Math;


/**
 * Some class methods.
 */
public class Math {
	
	public static int seriesLimit = 20;
  /**
   * Return the absolute value of a given argument
   * @param value The argument to be considered
   * @return the argument's absolute (positive) value.
   */
  public static double abs(double value) {
	  if (value >= 0)
	  {
		  return value;
	  }else
	  {
		 return (value*(-1));
	  }
  }
  
  /**
   * The maximum of two arguments
   * @param a First argument
   * @param b Second argument
   * @return The maximum of a and b
   */
  public static double max(double a, double b) {
	  if (a > b)
	  {
		  return a;
	  } else
	  {
		  return b;
	  }
  }
  
  /**
   * The maximum of three arguments
   * 
   * @param a First argument
   * @param b Second argument
   * @param c Third argument
   * @return The maximum of a, b and c
   */
  public static double max(double a, double b, double c) {
	  
	  if (max(a,b) > c)
	  {
		  return max(a,b);
	  }else
	  {
		  return c;
	  }
  }
  
  
  /**
   * @param seriesLimit The last term's index of a power series to be included,
   */
  public void setSeriesLimit(int seriesLimit) {
	  this.seriesLimit = seriesLimit;
  }
  
  /**
   * Approximating the natural exponential function by a finite
   * number of terms from the corresponding power series.
   * 
   * A power series implementation has to be finite since an 
   * infinite number of terms requires infinite execution time.
   * 
   * The number of terms to be considered can be set by {@link #setSeriesLimit(int)}}
   * 
   * @param x
   * @return
   */
  public static double exp(double x) {
	  
	  double glied = 0;
	  double e=0;
	  
	  for (int i = 0; i<=seriesLimit; i++)
	  {
		  int multiplikator = i;
		  double zähler = 1;
		  double nennerglied = 1;
		  double nenner = 1;
		  while (multiplikator>=1)
		  {
			  
			  
			  for ( ; multiplikator>0; multiplikator--)
			  {
				  zähler *= x;
				  nenner *= multiplikator;
			  }
			  
		  }
		  
		  if (nenner>0)
		  {
		  glied = zähler / nenner;
		  }
		  
		  e += glied;
		  
		  if (i == seriesLimit)
		  {
			  return e;
		  }
		  
		  
	  }
	  
	  return e;
	  
	  
	
	  
  }
	
  
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  for ( ; x>0; x--)
//	  {
//		  double zähler=1;
//		  double temp=1;
//		  
//		  for ( ; seriesLimit>0; seriesLimit--)
//		  {
//		 
//		  temp *=x;
//		  
//		  
//		  int divisor = 1;
//		  for (int i = 0 ; i==seriesLimit; i++)
//		  {
//			  divisor *= seriesLimit;
//		  }
//		  
//		  
//		  
//		  double glied = temp/divisor;
//		  
//		  double e = 0;
//		  e += glied;
//		  
//		  if (seriesLimit == 1)
//		  {
//			  return zähler;  
//		  }
//		 
//		  }
//		  
//		 
//		  
//	  }
//return 3.5;
	  
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  

  
  
  
  
  

