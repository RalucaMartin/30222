package zoowsome.models.animals;

public class Frog extends Aquatic {

	public Frog() {
		setNrOfLegs(4);
		setName("Frog");
		super.setWatertype(watertype.Freshwater);
		super.setAvgSwimDepth(0);
	} 
	
	public Frog(int nrOfLegs, String name, watertype type, int avgSwimDepth) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setWatertype(type);
		super.setAvgSwimDepth(avgSwimDepth);
	}
}
