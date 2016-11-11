package javasmmr.zoowsome.models.animals;

public class Clownfish extends Aquatic {
	public Clownfish(int nrOfLegs, String name, int avgSwimDepth, Enum waterType) {
		this.setName(name);
		this.avgSwimDepth = avgSwimDepth;
		this.setNrOfLegs(nrOfLegs);
		this.waterType = waterType;

	}

	public Clownfish() {
		this.setName("Nemo");;
		this.avgSwimDepth = 20;
		this.waterType = Enum.Saltwater;
		this.setNrOfLegs(0);

	}
}
