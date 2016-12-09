package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	boolean laysEggs;

	public Reptile(double maintenanceCost, double dangPerc, boolean laysEggs) {
		super(maintenanceCost, dangPerc);
		this.laysEggs = laysEggs;
		// TODO Auto-generated constructor stub
	}

}
