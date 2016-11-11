package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.utils.Constants;

public class MainController {
	public static void main(String[] args) {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Bear);
		System.out.println("We have an animal with " + a1.getNrOfLegs()+" legs!\n");
		System.out.println("His name is "+a1.getString());

	}

}
