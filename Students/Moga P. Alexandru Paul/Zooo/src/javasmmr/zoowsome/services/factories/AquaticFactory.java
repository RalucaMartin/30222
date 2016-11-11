package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animal.Animal;
import javasmmr.zoowsome.models.animal.Dolphin;
import javasmmr.zoowsome.models.animal.Shark;
import javasmmr.zoowsome.models.animal.Whale;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		if(Constants.Animals.Aquatics.Shark.equals(type)){
			return new Shark();
		}else if (Constants.Animals.Aquatics.Dolphin.equals(type)){
			return new Dolphin();
		}else if(Constants.Animals.Aquatics.Whale.equals(type)){
			return new Whale();
		}else{
			throw new Exception("Invalid animal exception:");
		}
	}

}
