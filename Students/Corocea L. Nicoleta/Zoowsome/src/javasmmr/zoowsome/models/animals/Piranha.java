package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic {
	public Piranha(int nrOfLegs, String name, int avgSwimDepth, Enum waterType, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, avgSwimDepth, waterType);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Piranha() {
		super(3, 0.8, 10, Enum.Freshwater);
		this.setName("Piranha");
		this.setNrOfLegs(0);

	}
}
