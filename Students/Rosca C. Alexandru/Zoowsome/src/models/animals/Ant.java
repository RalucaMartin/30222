package models.animals;

public class Ant extends Insect{
	
	private int lvlPainBite;
	
	/*
	public Ant(){
		nrOfLegs = 10;
		name = "Ant";
		isDangerous = true;
		canFly = false;
		setLvlPainBite(5);
		
	}
	*/
	
	public Ant(int lvlPainBite, boolean canFly, boolean isDangerous){
		super(0.5, 0.2);
		setNrOfLegs(10);
		setName("Ant");
		this.setLvlPainBite(lvlPainBite);
		this.isDangerous = isDangerous;
		this.canFly = canFly;
	}

	public int getLvlPainBite() {
		return lvlPainBite;
	}

	public void setLvlPainBite(int lvlPainBite) {
		this.lvlPainBite = lvlPainBite;
	}
	
}
