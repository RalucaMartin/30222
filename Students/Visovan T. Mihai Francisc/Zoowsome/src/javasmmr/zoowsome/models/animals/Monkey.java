package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Monkey(){
		
		super(6.3,0.5);
		super.nrOfLegs = 2;
		super.normalBodyTemp = 32.5F;
		super.percBodyHair = 40.2F;
		super.name = "Monkey";
	}
}