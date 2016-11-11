package javasmmr.zoowsome.models.animals;

public class Cricket extends Insect{

	public Cricket(int NoOfLegs, String name, boolean canFly, boolean isDangerous){
		setNoOfLegs(NoOfLegs);
		setName(name);
		setCanFLy(canFly);
		setIsDangerous(isDangerous);
		
	}
	
	public Cricket() {
		// TODO Auto-generated constructor stub
		this(6, "Greiere", true, false);
	}

}
