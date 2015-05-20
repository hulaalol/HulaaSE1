package de.hdm_stuttgart.mi.sd1.PitfallsEquals;


public class PitfallsEquals {
   
 
    	public static void main(String[] args) {

    		  final String a1 = "TestA", a2 = "TestA"; // a1 & a2 --> 1 Objekt TestA im Heap
    		  System.out.println("a1 == a2: " + (a1 == a2));
    		  System.out.println("a1.equals(a2): " + a1.equals(a2));

    		  final String b1 = new String("TestB"), b2 = new String("TestB"); 
    		  // b1 --> neues Objekt "TestB" | b2 --> neues Objekt "TestB"  / 
    		  //b1 nicht gleiche Referenzwert auf Objekt wie b2 obwohl Inhalt gleich (.equals = true)
    		  System.out.println("b1 == b2: " + (b1 == b2));
    		  System.out.println("b1.equals(b2): " + b1.equals(b2));
    		}

    }

