package javasmmr.zoowesome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach() {
		setNrOfLegs(6);
		setName("Cicic");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Cockroach( String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(6);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}


