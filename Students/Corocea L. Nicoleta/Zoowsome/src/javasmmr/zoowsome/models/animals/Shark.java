package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(int nrOfLegs, String name, int avgSwimDepth, Enum waterType, double maintenanceCost, double dangPerc) {
		super(maintenanceCost, dangPerc, avgSwimDepth, waterType);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Shark() {
		super(5, 1, 20, Enum.Saltwater);
		this.setName("Shark");
		this.setNrOfLegs(0);

	}
}
