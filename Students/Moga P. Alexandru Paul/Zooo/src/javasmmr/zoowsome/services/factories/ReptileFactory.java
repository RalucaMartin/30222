package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animal.Animal;
import javasmmr.zoowsome.models.animal.Lizard;
import javasmmr.zoowsome.models.animal.Snake;
import javasmmr.zoowsome.models.animal.Turtle;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		if(Constants.Animals.Reptiles.Lizard.equals(type)){
			return new Lizard();
		}else if (Constants.Animals.Reptiles.Snake.equals(type)){
			return new Snake();
		}else if(Constants.Animals.Reptiles.Turtle.equals(type)){
			return new Turtle();
		}else{
			throw new Exception("Invalid animal exception:");
		}
	}

}
