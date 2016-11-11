package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider() {
		super();
		this.setNrOfLegs(8);
		this.setName("Spider");
		this.setCanFly(false);
		this.setIsDangerous(true);
	}
}
