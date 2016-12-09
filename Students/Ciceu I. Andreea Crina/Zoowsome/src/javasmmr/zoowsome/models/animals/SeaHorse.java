package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class SeaHorse extends Aquatic{
		public SeaHorse ( int nrOfLegs, String name, int avgSwimDepth, waterType water) {
			super(0.1,0.0);
			setNrOfLegs(nrOfLegs);
			setName(name);
			setAvgSwimDepth(avgSwimDepth);
			setWater(water);
		}
		public SeaHorse(){
			this (0, "SeaHorse", 200, waterType.freshWater);
		}
		public boolean kill() {
			Random random = new Random();
			int ran = random.nextInt(10);
			if((ran/10) < dangerPerc) {
				return true;
			} 
			else {
				return false;
			}
		}

}
