package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	boolean canFly;
	boolean isDangerous;

	public Insect(double maintenanceCost, double dangPerc, boolean canFLy, boolean isDangerous) {
		super(maintenanceCost, dangPerc);
		this.canFly = canFLy;
		this.isDangerous = isDangerous;
	}
}
