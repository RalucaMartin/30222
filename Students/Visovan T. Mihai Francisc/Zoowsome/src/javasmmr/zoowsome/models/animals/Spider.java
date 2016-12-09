package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Spider(){
		super(3.0,0.9);
		super.nrOfLegs = 8;
		super.isDangerous = true;
		super.canItFly = false;
		super.name = "Spider";
		
	}
}
