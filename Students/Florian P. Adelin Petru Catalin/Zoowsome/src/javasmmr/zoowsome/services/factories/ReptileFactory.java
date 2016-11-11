package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Reptiles.ALLIGATOR.equals(type)){
			return new Alligator();
		}else if(Constants.Animals.Reptiles.LIZZARD.equals(type)){
			return new Lizzard();
		}else if(Constants.Animals.Reptiles.SNAKE.equals(type)){
			return new Snake();
		}else {
			throw new Exception("Invalid Animal exception");
		}
	}

}
