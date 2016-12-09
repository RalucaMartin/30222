

package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	public Whale ( Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
		 		setNrOfLegs ( nrOfLegs ) ;
		 		setName ( name ) ;
		 		setAvgSwimDepth ( avgSwimDepth ) ;
		 		setWaterType ( waterType ) ;
		 	}
		 
	public Whale (){
 		this ( 0, "Orca", 20, WaterType.freshwater ) ;
 	}
}
