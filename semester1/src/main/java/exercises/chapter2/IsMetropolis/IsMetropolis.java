package exercises.chapter2.IsMetropolis;

public class IsMetropolis {

	public static void main(String[] args) {
		
		boolean isCapitalCity=true;
		int numberOfCitiziens=100000 ;
		double taxPerCitizien=601;
		long yearlyIncome= ((long)taxPerCitizien * numberOfCitiziens * 12);
		
		boolean Metropolis=false;
		
		
		
		if (isCapitalCity=true && numberOfCitiziens>=100_000
				|| yearlyIncome>720_000_000 && numberOfCitiziens>=200_000 )    
			
			// Bedingung 1: Hauptstadt mit mehr als 100.000 Einwohner, Steuereinnahmen irrelevant	
		{
			Metropolis = true;
		}
		
	
		
		
		//if (yearlyIncome>720_000_000 && numberOfCitiziens>200_000)
			// Bedingung 2: Stadt mit mehr als 200.000 Einwohner und mehr als 720 Millionen Steuereinnahmen,
			// und keine Hauptstadt	
		//{
//			//Metropolis = true;
		//}
		
	
		//Ausgabe
		System.out.println("Metropolis? " + Metropolis);
		System.out.println("Einwohnerzahl= " + numberOfCitiziens);
		System.out.println("Steuer pro Einwohner/Monat= " + taxPerCitizien);
		System.out.println("Steuereinnahme der Stadt pro Jahr= " + yearlyIncome / 1_000_000 + " Millionen");

	}

}
