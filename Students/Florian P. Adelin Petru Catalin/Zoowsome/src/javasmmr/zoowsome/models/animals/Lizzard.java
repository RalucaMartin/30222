package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile {

	public Lizzard(){
		this("Lizzard",4,true);
	}
	public Lizzard(String name, int nrOfLegs, boolean layEggs) {
		super(0.2,0.5);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
	}
}
