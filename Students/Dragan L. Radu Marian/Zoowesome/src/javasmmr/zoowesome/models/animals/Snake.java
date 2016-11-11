package javasmmr.zoowesome.models.animals;

public class Snake extends Reptile {
	
	public Snake() {
		setNrOfLegs(0);
		setName("Sisi");
		laysEggs = true;
	}
	
	public Snake( String name, Boolean laysEggs) {
		setName(name);
		this.laysEggs = laysEggs;
	}

}
