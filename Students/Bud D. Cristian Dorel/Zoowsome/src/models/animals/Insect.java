package models.animals;

public class Insect extends Animal{
	private boolean canFly;
	private boolean isDangerous;
	
	public boolean getCanFly(){
		return this.canFly;
	}
	
	public void setCanFly(boolean canFly){
		this.canFly = canFly;
	}
	
	public boolean getIsDangerous(){
		return this.isDangerous;
	}
	
	public void setIsDangerous(boolean isDangerous){
		this.isDangerous = isDangerous;
	}
}
