package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;


public class BirdFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception{
		if (Constants.Animals.Birds.SWALLOW.equals(type)) {
			return new Swallow(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.EAGLE.equals(type)) {
			return new Eagle();
		}else if (Constants.Animals.Birds.DOVE.equals(type)) {
			return new Dove();
		}
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
	
}
