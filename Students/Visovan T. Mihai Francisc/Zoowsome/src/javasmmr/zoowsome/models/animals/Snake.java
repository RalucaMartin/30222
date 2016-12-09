package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Snake(){
		super(8.0,1.0);
		super.nrOfLegs = 0;
		super.layEggs = true;
		super.name = "Snake";
	}
}
