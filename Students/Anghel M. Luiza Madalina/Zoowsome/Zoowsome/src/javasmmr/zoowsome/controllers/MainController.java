package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {
		String result;
		int dimension = 50;
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory
				.getSpeciesFactory(Constants.Species.MAMMALS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
		System.out
				.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());

		System.out.println("Tiger is dangerous with a rate of "
				+ a1.getDangerPerc());

		CaretakerFactory caretakerFactory = new CaretakerFactory();
		Employee[] caretaker = new Caretaker[Constants.NR_OF_CARETAKERS];

		int newAnimal;
		Animal[] animal = new Animal[dimension];
		Random random = new Random();

		for (int i = 1; i <= Constants.NR_OF_CARETAKERS; i++) {
			for (int j = 1; j <= Constants.NR_OF_ANIMALS; j++) {
				if ((caretaker[i].getIsDead() == false)
						&& (animal[j].isTakenCareOf() == false)) {
					result = ((Caretaker) caretaker[i]).takeCareOf(animal[j]);
					if (result
							.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretaker[i].setIsDead(true);
					} else if (result
							.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						animal[j].setTakenCareOf(true);
					}
				}
			}
		}
	}
}
