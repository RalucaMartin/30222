package javasmmr.zoowsome.models.animal;

public class Spider extends Insect {

	public Spider() {
		this("Spider",6,false,true);
	}
	
	public Spider(String name, int nrOfLegs, boolean canFly, boolean isDangerous){
		super(0.1, 0.3);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}

}
