package exercises.chapter3.LeapYearMethod;

import java.util.Scanner;


public class LeapYearMethod {
	int inputYear;

	public LeapYearMethod (int year) //constructor
	{
		this.inputYear = year;
	}
	
	
	public static boolean LeapYearCheck (int inputYear)
	{
		if (inputYear%4==0)
		{
			if ((inputYear%100==0 && inputYear%400==0)|| (inputYear%100!=0 && inputYear%400!=0))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else 
		{
			return false;
		}

	}

	

	

}

