package javasmmr.zoowsome.models.animal;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
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
