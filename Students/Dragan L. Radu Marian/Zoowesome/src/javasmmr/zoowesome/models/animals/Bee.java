package javasmmr.zoowesome.models.animals;

public class Bee extends Insect {
	
	public Bee() {
		setNrOfLegs(6);
		setName("Bubi");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Bee( String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(6);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
