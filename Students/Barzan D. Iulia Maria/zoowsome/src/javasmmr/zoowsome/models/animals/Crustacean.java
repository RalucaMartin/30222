
package javasmmr.zoowsome.models.animals;

public class Crustacean extends Aquatic {
	public Crustacean ( Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType watertype ) {
				setNrOfLegs ( nrOfLegs ) ;
		 		setName ( name ) ;
		 		setAvgSwimDepth ( avgSwimDepth ) ;
		 		setWaterType ( watertype ) ;
		 		
		 	}
		 	
	public Crustacean () {
 		this ( 0, "Scorpion", 20, WaterType.freshwater ) ;
 	}

}
