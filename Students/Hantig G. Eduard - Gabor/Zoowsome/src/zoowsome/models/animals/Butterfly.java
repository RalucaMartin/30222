package zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly() {
		setNrOfLegs(0);
		setName("Butterfly");
		super.setCanFly(true);
		super.setDangerous(false);
	}
	
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setCanFly(canFly);
		super.setDangerous(isDangerous);
	}
}