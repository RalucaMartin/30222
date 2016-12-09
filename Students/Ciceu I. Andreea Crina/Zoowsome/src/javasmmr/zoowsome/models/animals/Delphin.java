package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Delphin extends Aquatic{
		public Delphin ( int nrOfLegs, String name, int avgSwimDepth, waterType water) {
			super(0.2,0.0);
			setNrOfLegs(nrOfLegs);
			setName(name);
			setAvgSwimDepth(avgSwimDepth);
			setWater(water);
		}
		public Delphin(){
			this (0, "Delphin", 1000, waterType.freshWater);
			
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
