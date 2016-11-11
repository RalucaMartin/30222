package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic {
	public Piranha(int nrOfLegs, String name, int avgSwimDepth, Enum waterType) {
		this.setName(name);
		this.avgSwimDepth = avgSwimDepth;
		this.setNrOfLegs(nrOfLegs);
		this.waterType = waterType;

	}

	public Piranha() {
		this.setName("Piranha");
		this.avgSwimDepth = 10;
		this.waterType = Enum.Freshwater;
		this.setNrOfLegs(0);

	}
}
