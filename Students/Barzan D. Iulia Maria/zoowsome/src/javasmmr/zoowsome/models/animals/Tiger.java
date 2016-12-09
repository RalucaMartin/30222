

package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	public Tiger (Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setNormalBodyTemp ( normalBodyTemp ) ;
		setPercBodyHair ( percBodyHair ) ;
	}
	
	public Tiger () {
		this (4, "White tiger", 32, 95);
	}

}