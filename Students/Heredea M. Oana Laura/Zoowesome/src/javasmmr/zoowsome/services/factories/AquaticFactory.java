package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;


public class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatic.Whale.equals(type)) {
			return new Whale(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatic.Dolphin.equals(type)) {
			return new Dolphin();
		}
		else if (Constants.Animals.Aquatic.Shark.equals(type)) {
			return new Shark();
		}
		
		else {

				throw new Exception("Invalid animal exception!");
			
		}
	}

}
