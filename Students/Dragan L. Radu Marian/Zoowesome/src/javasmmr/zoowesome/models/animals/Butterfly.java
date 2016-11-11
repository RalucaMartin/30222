package javasmmr.zoowesome.models.animals;

public class Butterfly extends Insect {
	
	public Butterfly() {
		setNrOfLegs(6);
		setName("Cici");
		canFly = true;
		isDangerous = false;
	}
	
	public Butterfly( String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(6);
		setName(name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
}
