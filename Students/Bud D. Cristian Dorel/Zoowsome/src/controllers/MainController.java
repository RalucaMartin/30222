package controllers;

import models.animals.Animal;
import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.SpeciesFactory;

public class MainController {
	public static void main(String args[])throws Exception{
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMAL);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.MONKEY);
		System.out.printf("We have an animal with %d legs !\n",a1.getNrOfLegs());
	}
}
