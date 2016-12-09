package javasmmr.zoowsome.models.animal;


public class Butterfly extends Insect {

	public Butterfly() {
		this("Butterfly",6,true,false);
	}
	
	public Butterfly(String name, int nrOfLegs, boolean canFly, boolean isDangerous){
		super(0.1, 0.1);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}

}
