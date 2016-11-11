package zoowsome.services.factories;

import zoowsome.models.animals.Alligator;
import zoowsome.models.animals.Animal;
import zoowsome.models.animals.Lizzard;
import zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {

		public Animal getAnimal(String type) throws Exception{
			if (Constants.Animals.Reptile.ALLIGATOR.equals(type)) {
				return new Alligator();
			} else if(Constants.Animals.Reptile.LIZZARD.equals(type)) {
				return new Lizzard();
			} else if(Constants.Animals.Reptile.SNAKE.equals(type)) {
				return new Snake();
			} else {
				throw new Exception("Invalid animal exception!");
			}
		}
}
