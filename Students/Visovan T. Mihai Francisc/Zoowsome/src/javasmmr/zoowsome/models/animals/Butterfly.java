package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Butterfly(){
		super(1.0, 0.1);
		super.nrOfLegs = 4;
		super.isDangerous = false;
		super.canItFly = true;
		super.name = "Butterfly";
	}
}
