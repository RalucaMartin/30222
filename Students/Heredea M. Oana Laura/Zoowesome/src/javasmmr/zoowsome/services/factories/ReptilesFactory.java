package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptilesFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.Lizzard.equals(type)) {
			return new Lizzard();
		}
		else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		}
		
		else {
			
				throw new Exception("Invalid animal exception!");
			
		}
	}

}
