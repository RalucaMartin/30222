package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	
	public Spider(int NoOfLegs, String name, boolean canFly, boolean isDangerous){
		setNoOfLegs(NoOfLegs);
		setName(name);
		setCanFLy(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Spider() {
		// TODO Auto-generated constructor stub
		this(8, "Vaduva neagra", false, true);
	}

}
