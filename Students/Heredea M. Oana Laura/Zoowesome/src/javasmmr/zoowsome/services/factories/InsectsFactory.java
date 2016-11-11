package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Dragonfly;
import javasmmr.zoowsome.models.animals.Spider;


public class InsectsFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(); // leave empty constructor, for now!
		} else if (Constants.Animals.Insects.Dragonfly.equals(type)) {
			return new Dragonfly();
		}
		else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		}
		
		else {
			
				throw new Exception("Invalid animal exception!");
			
		}
	}

}
