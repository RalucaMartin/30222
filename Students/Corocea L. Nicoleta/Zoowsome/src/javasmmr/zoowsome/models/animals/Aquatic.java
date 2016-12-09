package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	int avgSwimDepth;
	Enum waterType;

	public Aquatic(double maintenanceCost, double dangPerc, int avgSwimDepth, Enum waterType) {
		super(maintenanceCost, dangPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
		// TODO Auto-generated constructor stub
	}

}
