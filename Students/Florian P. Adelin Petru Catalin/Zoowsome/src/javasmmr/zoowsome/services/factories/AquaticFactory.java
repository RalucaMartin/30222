package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Aquatics.DOLPHIN.equals(type)){
			return new Dolphin();
		}else if(Constants.Animals.Aquatics.SHARK.equals(type)){
			return new Shark();
		}else if(Constants.Animals.Aquatics.WHALE.equals(type)){
			return new Whale();
		}else {
			throw new Exception("Invalid Animal exception");
		}
	}
}
