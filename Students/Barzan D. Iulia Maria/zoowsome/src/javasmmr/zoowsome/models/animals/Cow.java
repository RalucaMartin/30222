package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow (Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setNormalBodyTemp ( normalBodyTemp ) ;
		setPercBodyHair ( percBodyHair ) ;
	}
	
	public Cow (){
		this ( 4, "American Quarter Horse", 37, 93) ;
	}
}
