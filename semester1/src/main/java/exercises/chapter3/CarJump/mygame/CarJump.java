package exercises.chapter3.CarJump.mygame;

public class CarJump {
	
	final double gravitation= 9.81;
	double masseAuto;
	
	
	
	double hoeheStartrampe;
	double winkelStartrampe;
	
	
	double hoeheRampe;
	double winkelAbsprung;
	
	double distanz;
	
	double winkelLandung;
	
	public CarJump (double masseAuto, double hoeheStartrampe, double winkelStartrampe,
			double hoeheRampe, double winkelAbsprung, double distanz, double winkelLandung) {
	     this.masseAuto = masseAuto;
	     this.hoeheStartrampe = hoeheStartrampe;
	     this.winkelStartrampe = winkelStartrampe;
	     this.hoeheRampe = hoeheRampe;
	     this.winkelAbsprung = winkelAbsprung;
	     this.distanz = distanz;
	     this.winkelLandung = winkelLandung;
	  }  
	

	public double getHangabtriebskraft()
	{
		return (masseAuto*gravitation*(Math.sin(Math.toRadians(winkelStartrampe))) - (0.011*getNormalkraftkomponente()));
		
	}
	
	public double getNormalkraftkomponente()
	{
		return masseAuto*gravitation*(Math.cos(Math.toRadians(winkelStartrampe)));
		
	}
	
	public double getBeschleunigung()
	{
		return (getHangabtriebskraft()/masseAuto);
	}
	
	// c = a * sin(γ) / sin(α)
	
	public double getDistanzZuRampe()
	{
		double Alpha = winkelStartrampe;
		double Beta = 90- Alpha;
		return (hoeheStartrampe/(Math.sin(Math.toRadians(Alpha))));
		
	}
	
	public double getGeschwindigkeit()
	{
	 return (getBeschleunigung()*(Math.sqrt(getDistanzZuRampe()/((getBeschleunigung()/2)))));
		
	}
	
	
	
	public double getSprungweite()
	{
		return (((getGeschwindigkeit()*(Math.cos(Math.toRadians(winkelAbsprung))))/gravitation)*((getGeschwindigkeit()*(Math.sin(Math.toRadians(winkelAbsprung))))+(Math.sqrt(getGeschwindigkeit()*getGeschwindigkeit()*(Math.sin(Math.toRadians(winkelAbsprung)))*(Math.sin(Math.toRadians(winkelAbsprung)))+(2*hoeheRampe*gravitation)))));
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
