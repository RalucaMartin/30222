package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(){
		this("Butterfly",4,true,false);
	}
	public Butterfly(String name, int nrOfLegs, boolean canFly, boolean isDangerous) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
