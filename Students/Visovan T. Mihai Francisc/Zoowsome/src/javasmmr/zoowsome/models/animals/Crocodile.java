package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Crocodile(){
		super(8.0,0.9);
		super.nrOfLegs = 4;
		super.layEggs = true;
		super.name = "Crocodile";
	}
	
}
