package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly(int noOfLegs, String name, boolean canFly, boolean isDangerous){
		setNoOfLegs(noOfLegs);
		setName(name);
		setIsDangerous(isDangerous);
	}
	
	public Butterfly() {
		// TODO Auto-generated constructor stub
		this(0, "Coada-randunicii", true, false);
	}

}
