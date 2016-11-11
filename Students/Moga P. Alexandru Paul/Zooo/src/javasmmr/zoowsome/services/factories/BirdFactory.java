package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animal.Animal;
import javasmmr.zoowsome.models.animal.Eagle;
import javasmmr.zoowsome.models.animal.Flamingo;
import javasmmr.zoowsome.models.animal.Parrot;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		if(Constants.Animals.Birds.Eagle.equals(type)){
			return new Eagle();
		}else if (Constants.Animals.Birds.Flamingo.equals(type)){
			return new Flamingo();
		}else if(Constants.Animals.Birds.Parrot.equals(type)){
			return new Parrot();
		}else{
			throw new Exception("Invalid animal exception:");
		}
	}

}
