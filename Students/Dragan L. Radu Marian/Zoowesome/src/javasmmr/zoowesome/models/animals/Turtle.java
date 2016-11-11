package javasmmr.zoowesome.models.animals;

public class Turtle extends Reptile {
	
	public Turtle() {
		setNrOfLegs(4);
		setName("Tuti");
		laysEggs = true;
	}
	
	public Turtle( String name, Boolean laysEggs) {
		setName(name);
		this.laysEggs = laysEggs;
	}

}