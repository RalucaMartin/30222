package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Mammals.COW.equals(type)){
			return new Cow();
		}else if(Constants.Animals.Mammals.TIGER.equals(type)){
			return new Tiger();
		}else if(Constants.Animals.Mammals.MONKEY.equals(type)){
			return new Monkey();
		}else {
			throw new Exception("Invalid Animal exception");
		}
	}
}
