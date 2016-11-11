package models.animals;

public class Fly extends Insect{
	
	private int lifeTime;
	
	/*public Fly(){
		nrOfLegs = 6;
		name = "Fly";
		isDangerous = false;
		canFly = true;
		setLifeTime(2);
	}
	*/
	public Fly(int lifeTime, boolean canFly, boolean isDangerous){
		super(0.1, 0);
		setNrOfLegs(6);
		setName("Fly");
		this.setLifeTime(lifeTime);
		this.isDangerous = isDangerous;
		this.canFly = canFly;
	}

	public int getLifeTime() {
		return lifeTime;
	}

	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}
}
