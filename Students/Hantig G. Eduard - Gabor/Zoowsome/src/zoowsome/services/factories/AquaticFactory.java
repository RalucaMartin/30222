package zoowsome.services.factories;

import zoowsome.models.animals.Animal;
import zoowsome.models.animals.Frog;
import zoowsome.models.animals.Shark;
import zoowsome.models.animals.Whale;


public class AquaticFactory extends SpeciesFactory {

		public Animal getAnimal(String type) throws Exception{
			if (Constants.Animals.Aquatic.FROG.equals(type)) {
				return new Frog();
			} else if(Constants.Animals.Aquatic.SHARK.equals(type)) {
				return new Shark();
			} else if(Constants.Animals.Aquatic.WHALE.equals(type)) {
				return new Whale();
			} else {
				throw new Exception("Invalid animal exception!");
			}
		}
}
