package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Flamingo;
import javasmmr.zoowsome.models.animals.Kiwi;
import javasmmr.zoowsome.models.animals.Swan;


public class BirdsFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Flamingo.equals(type)) {
			return new Flamingo(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.Kiwi.equals(type)) {
			return new Kiwi();
		}
		else if (Constants.Animals.Birds.Swan.equals(type)) {
			return new Swan();
		}
		
		else {
			
				throw new Exception("Invalid animal exception!");
			
		}
	}

}
