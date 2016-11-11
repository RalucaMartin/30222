package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animal.Animal;
import javasmmr.zoowsome.models.animal.Cow;
import javasmmr.zoowsome.models.animal.Monkey;
import javasmmr.zoowsome.models.animal.Tiger;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		if(Constants.Animals.Mammals.Tiger.equals(type)){
			return new Tiger();
		}else if (Constants.Animals.Mammals.Monkey.equals(type)){
			return new Monkey();
		}else if(Constants.Animals.Mammals.Cow.equals(type)){
			return new Cow();
		}else{
			throw new Exception("Invalid animal exception:");
		}
	}

}
