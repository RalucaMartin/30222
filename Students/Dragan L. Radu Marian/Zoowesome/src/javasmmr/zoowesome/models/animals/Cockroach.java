package javasmmr.zoowesome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach() {
		setNrOfLegs(6);
		setName("Cicic");
		canFly = false;
		isDangerous = false;
	}
	
	public Cockroach( String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(6);
		setName(name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
}


