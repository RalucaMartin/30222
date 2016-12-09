package javasmmr.zoowsome.models.animals;

public class Tortoise extends Reptile{

	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Tortoise(){
		super(0.1,0.1);
		super.nrOfLegs = 4;
		super.layEggs = true;
		super.name = "Tortoise";
		
	}
}
