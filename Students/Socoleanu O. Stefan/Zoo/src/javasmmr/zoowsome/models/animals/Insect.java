package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public Insect(double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
	}
	public Insect() {
		super();
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
}
