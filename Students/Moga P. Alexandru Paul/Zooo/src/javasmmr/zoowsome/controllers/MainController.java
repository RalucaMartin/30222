package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animal.Animal;

import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1=speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("we have an animal with %d legs\n",a1.getNrOfLegs());

	}

}
