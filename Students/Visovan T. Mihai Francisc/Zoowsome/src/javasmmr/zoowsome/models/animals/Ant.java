package javasmmr.zoowsome.models.animals;


public class Ant extends Insect  {

	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	
	public Ant(){
		
		super(0.5,0.1);
		super.nrOfLegs = 6;
		super.isDangerous = false;
		super.canItFly = false;
		super.name = "Ant";
		
	}
}
