package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(int nrOfLegs, String name, int avgSwimDepth, Enum waterType) {
		this.setName(name);
		this.avgSwimDepth = avgSwimDepth;
		this.setNrOfLegs(nrOfLegs);
		this.waterType = waterType;

	}

	public Shark() {
		this.setName("Shark");
		this.avgSwimDepth = 50;
		this.waterType = Enum.Saltwater;
		this.setNrOfLegs(0);

	}
}
