package models.animals;

public class Mosquito extends Insect{

	private boolean canCarryVirus;
	
	/*
	public Mosquito(){
		nrOfLegs = 8;
		name = "Mosquito";
		isDangerous = false;
		canFly = true;
		setCanCarryVirus(false);
	}
	*/
	
	public Mosquito(boolean canCarryVirus, boolean canFly, boolean isDangerous){
		super(0.1, 0.1);
		setNrOfLegs(8);
		setName("Mosquito");
		this.setCanCarryVirus(canCarryVirus);
		this.isDangerous = isDangerous;
		this.canFly = canFly;
	}

	public boolean isCanCarryVirus() {
		return canCarryVirus;
	}

	public void setCanCarryVirus(boolean canCarryVirus) {
		this.canCarryVirus = canCarryVirus;
	}
}
