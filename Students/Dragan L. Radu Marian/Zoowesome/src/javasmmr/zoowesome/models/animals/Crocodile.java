package javasmmr.zoowesome.models.animals;

public class Crocodile extends Reptile {
	
	public Crocodile() {
		setNrOfLegs(4);
		setName("Croco");
		laysEggs = true;
	}
	
	public Crocodile( String name, Boolean laysEggs) {
		setName(name);
		this.laysEggs = laysEggs;
	}

}