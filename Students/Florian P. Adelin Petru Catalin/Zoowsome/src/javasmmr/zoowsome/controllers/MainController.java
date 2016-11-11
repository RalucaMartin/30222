package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Constants;
import javasmmr.zoowsome.services.factories.*;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.SPIDER);
		System.out.println("We have an animal with "+a1.getNrOfLegs()+" legs");
		}
	}
