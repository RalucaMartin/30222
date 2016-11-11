package javasmmr.zoowesome.models.animals;

public class Seal extends Aquatic {
	
	public Seal() {
		setNrOfLegs(0);
		setName("Focii");
		avgSwimDepth = 50;
	}
	
	public Seal( String name, Integer avgSwimDepth) {
		setNrOfLegs(0);
		setName(name);
		this.avgSwimDepth = avgSwimDepth;
	}

}