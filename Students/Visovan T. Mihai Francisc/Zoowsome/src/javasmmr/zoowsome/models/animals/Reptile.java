package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	
	public Reptile(double maintenanceCost, double damagePerc) {
		super(maintenanceCost, damagePerc);
		// TODO Auto-generated constructor stub
	}

	boolean layEggs;

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
}
