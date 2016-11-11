package zoowsome.models.animals;

public class Spider extends Insect {

	public Spider() {
		setNrOfLegs(8);
		setName("Spider");
		super.setCanFly(false);
		super.setDangerous(false);
	}
	
	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setCanFly(canFly);
		super.setDangerous(isDangerous);
	}
}