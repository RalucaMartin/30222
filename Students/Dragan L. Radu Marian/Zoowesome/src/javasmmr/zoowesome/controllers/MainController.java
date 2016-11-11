package javasmmr.zoowesome.controllers;

import javasmmr.zoowesome.models.animals.Animal;
import javasmmr.zoowesome.services.factories.*;
import javasmmr.zoowesome.units.*;

public class MainController {
	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = null;
		try {
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Animal a1 = null;
		try {
			a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
	}
	
}
