package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;


public class ReptileFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception{
		if (Constants.Animals.Reptiles.CROCODILE.equals(type)) {
			return new Crocodile(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.LIZARD.equals(type)) {
			return new Lizard();
		}else if (Constants.Animals.Reptiles.SNAKE.equals(type)) {
			return new Snake();
		}
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
	
}
