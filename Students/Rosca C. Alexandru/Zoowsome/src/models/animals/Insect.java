package models.animals;

public abstract class Insect extends Animal{
	
	protected boolean canFly;
	protected boolean isDangerous;
	public boolean isCanFly() {
		return canFly;
	}
	
	public Insect(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
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
