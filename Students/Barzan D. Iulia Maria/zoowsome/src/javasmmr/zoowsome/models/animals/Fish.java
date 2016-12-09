
package javasmmr.zoowsome.models.animals;

public class Fish extends Aquatic {
	public Fish ( Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType watertype ) {
				setNrOfLegs ( nrOfLegs ) ;
		 		setName ( name ) ;
		 		setAvgSwimDepth ( avgSwimDepth ) ;
		 		setWaterType ( watertype ) ;
		 		
		 	}
		 	
	public Fish(){
 		this ( 0, "Trout", 20, WaterType.freshwater ) ;
 	}

}
