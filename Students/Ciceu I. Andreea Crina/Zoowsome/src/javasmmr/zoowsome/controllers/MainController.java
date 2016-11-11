package javasmmr.zoowsome.controllers;

import avasmmr.zoowsome.services.factories.AnimalFactory;
import avasmmr.zoowsome.services.factories.Constants;
import avasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;

public class MainController {
	
	public static void main(String[] args) throws Exception {
		
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
		System.out.printf("We have an animal with %s name!\n", a1.getName());
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Aquatics.Fish);
		System.out.printf("We have an animal with %d legs!\n", a2.getNrOfLegs());
		
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal a3 = speciesFactory3.getAnimal(Constants.Animals.Birds.Parrot);
		System.out.printf("We have an animal with %s name!\n", a3.getName());
		
		
	}

}
