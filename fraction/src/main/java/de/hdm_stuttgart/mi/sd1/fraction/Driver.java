package de.hdm_stuttgart.mi.sd1.fraction;

import de.hdm_stuttgart.mi.sd1.fraction.Fraction;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		final Scanner scan = new Scanner(System.in); // Read user input Zähler
		System.out.print("Zähler:  ");
		final int Zähler = scan.nextInt();

		System.out.println("        -----");

		final Scanner scan2 = new Scanner(System.in); // Read user input Nenner
		System.out.print("Nenner:  ");
		final int Nenner = scan.nextInt();

		System.out.print("\n");
		System.out.println("Gekürzter Bruch:   "
				+ Fraction.BuildFraction(Zähler, Nenner));

	}

}