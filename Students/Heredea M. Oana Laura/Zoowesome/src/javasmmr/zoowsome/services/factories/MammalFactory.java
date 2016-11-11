package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Bear;
import javasmmr.zoowsome.models.animals.Elephant;
import javasmmr.zoowsome.models.animals.Lion;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Wolf;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Elephant.equals(type)) {
			return new Elephant(); // leave empty constructor, for now!
		} else if (Constants.Animals.Mammals.Wolf.equals(type)) {
			return new Wolf();
		}
		else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		}
		else if (Constants.Animals.Mammals.Lion.equals(type)) {
			return new Lion();
		}
		else if (Constants.Animals.Mammals.Bear.equals(type)) {
			return new Bear();
		}
		else {
			
				throw new Exception("Invalid animal exception!");
			
		}
	}

}

