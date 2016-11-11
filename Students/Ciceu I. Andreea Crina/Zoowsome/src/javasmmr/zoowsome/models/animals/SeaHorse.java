package javasmmr.zoowsome.models.animals;

	public class SeaHorse extends Aquatic{
		public SeaHorse ( int nrOfLegs, String name, int avgSwimDepth, waterType water) {
			
			setNrOfLegs(nrOfLegs);
			setName(name);
			setAvgSwimDepth(avgSwimDepth);
			setWater(water);
		}
		public SeaHorse(){
			this (0, "SeaHorse", 200, waterType.freshWater);
		}

}
