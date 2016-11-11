package javasmmr.zoowsome.models.animals;

public class Delphin extends Aquatic{
		public Delphin ( int nrOfLegs, String name, int avgSwimDepth, waterType water) {
			
			setNrOfLegs(nrOfLegs);
			setName(name);
			setAvgSwimDepth(avgSwimDepth);
			setWater(water);
		}
		public Delphin(){
			this (0, "Delphin", 1000, waterType.freshWater);
		}

}
