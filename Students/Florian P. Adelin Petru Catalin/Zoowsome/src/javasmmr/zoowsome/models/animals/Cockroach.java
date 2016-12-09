package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(){
		this("Cockroach",8,false,false);
	}
	public Cockroach(String name, int nrOfLegs, boolean canFly, boolean isDangerous) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
