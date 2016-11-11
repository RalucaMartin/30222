package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Birds.CROW.equals(type)){
			return new Crow();
		}else if(Constants.Animals.Birds.EAGLE.equals(type)){
			return new Eagle();
		}else if(Constants.Animals.Birds.SPARROW.equals(type)){
			return new Sparrow();
		}else {
			throw new Exception("Invalid Animal exception");
		}
	}

}