package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Parrot(){
		super(2.4,0.2);
		super.nrOfLegs = 2;
		super.avgFlightAltitude = 200;
		super.migrates = false;
		super.name = "Parrot";
		
	}

}
