package zoowsome.models.animals;

public class Cockroach extends Insect {

	public Cockroach() {
		setNrOfLegs(6);
		setName("Butterfly");
		super.setCanFly(false);
		super.setDangerous(false);
	}
	
	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setCanFly(canFly);
		super.setDangerous(isDangerous);
	}
}