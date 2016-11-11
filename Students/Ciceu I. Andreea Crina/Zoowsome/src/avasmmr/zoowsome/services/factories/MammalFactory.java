package avasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} 
		else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} 
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
