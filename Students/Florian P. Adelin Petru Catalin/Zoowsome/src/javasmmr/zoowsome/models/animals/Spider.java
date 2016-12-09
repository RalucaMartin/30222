package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(){
		this("Spider",8,false,false);
	}
	public Spider(String name, int nrOfLegs, boolean canFly, boolean isDangerous) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
