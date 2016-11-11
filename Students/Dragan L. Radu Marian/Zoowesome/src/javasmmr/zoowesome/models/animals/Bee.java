package javasmmr.zoowesome.models.animals;

public class Bee extends Insect {
	
	public Bee() {
		setNrOfLegs(6);
		setName("Bubi");
		canFly = true;
		isDangerous = false;
	}
	
	public Bee( String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(6);
		setName(name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
}
