package exercises.chapter3.LeapYearMethod;

import java.util.Scanner;



public class LeapYearExecution {

	public static void main(String[] args) {
		
		final Scanner scan = new Scanner(System.in);   
		System.out.print("Welches Jahr soll überprüft werden? : ");
		final int yearInput = scan.nextInt();
		
		LeapYearMethod newYear = new LeapYearMethod(yearInput);
		
		if(newYear.LeapYearCheck(yearInput)==true)
		{
			System.out.println("Das Jahr " + yearInput + " ist ein Schaltjahr!");
		}else
		{
			System.out.println("Das Jahr " + yearInput + " ist KEIN Schaltjahr!");
		}
		
	}
}