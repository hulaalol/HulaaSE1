package exercises.chapter3.CarJump.mygame;

import java.util.Scanner;

public class CarJumpExecution {

	public static void main(String[] args) {
		
		final Scanner scan = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
		System.out.print("Gewicht Auto in kg=");
		final int masseAutoUserInput = scan.nextInt();
		
		final Scanner scan2 = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
		System.out.print("Höhe der Startrampe in Meter=");
		final int hoeheStartrampeUserInput = scan2.nextInt();
		
		final Scanner scan3 = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
		System.out.print("Winkel der Startrampe in °=");
		final int winkelStartrampeUserInput = scan3.nextInt();
		
		final Scanner scan4 = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
		System.out.print("Höhe der Absprungrampe=");
		final int hoeheRampeUserInput = scan4.nextInt();
		
		final Scanner scan5 = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
		System.out.print("Winkel der Absprungrampe=");
		final int winkelRampeUserInput = scan5.nextInt();
		
		
		
		CarJump firsttry = new CarJump(masseAutoUserInput, hoeheStartrampeUserInput, winkelStartrampeUserInput, hoeheRampeUserInput, winkelRampeUserInput, 30, 35);
		
		System.out.println("Hangabtriebskraft: " + (int) firsttry.getHangabtriebskraft()+ " N");
		System.out.println("Beschleunigung: " + firsttry.getBeschleunigung() + " m/s2");
		System.out.println("Strecke Abfahrt: " + firsttry.getDistanzZuRampe() + " m");
		System.out.println("Geschwindigkeit: " + 3.6*firsttry.getGeschwindigkeit() + " Km/h");
		System.out.println("Sprungdistanz: " + firsttry.getSprungweite() + " m");
	}

}
