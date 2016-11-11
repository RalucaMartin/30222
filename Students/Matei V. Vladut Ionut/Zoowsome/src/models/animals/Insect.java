package models.animals;

public abstract class Insect extends Animal {
	public boolean canFly;
	public boolean isDangerous;
	

	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	

	

}
