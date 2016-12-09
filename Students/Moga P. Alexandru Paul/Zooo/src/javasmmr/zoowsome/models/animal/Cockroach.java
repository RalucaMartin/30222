package javasmmr.zoowsome.models.animal;

public class Cockroach extends Insect {

	public Cockroach() {
		this("Cockroach",6,false,false);
	}
	
	public Cockroach(String name, int nrOfLegs, boolean canFly, boolean isDangerous){
		super(0.1, 0.1);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
