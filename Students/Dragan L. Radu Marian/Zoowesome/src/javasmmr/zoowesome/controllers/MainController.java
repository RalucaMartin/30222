package javasmmr.zoowesome.controllers;

import java.util.Random;


import javasmmr.zoowesome.models.animals.*;
import javasmmr.zoowesome.models.employees.*;
import javasmmr.zoowesome.services.factories.*;
import javasmmr.zoowesome.units.*;

public class MainController {
	public static void main(String[] args) {
		int i;
		Random random = new Random();
		
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = null;
		SpeciesFactory speciesFactory2 = null;
		SpeciesFactory speciesFactory3 = null;
		SpeciesFactory speciesFactory4 = null;
		SpeciesFactory speciesFactory5 = null;
		
		try {
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
			speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
			speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
			speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
			speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Animal a1 = null;
		try {
			a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.SEAHORSE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		
		Animal[] a;
		a = new Animal[50];
		
		for(i = 0; i< 50; i++) {
			int species = random.nextInt(5);
			int animal = random.nextInt(3);
			switch(species) {
			
			case 0: 
				switch(animal) {
					case 0: try {
						a[i] =speciesFactory1.getAnimal(Constants.Animals.Aquatics.SEAHORSE);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 1: try {
						a[i] =speciesFactory1.getAnimal(Constants.Animals.Aquatics.SEAL);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 2: try {
						a[i] =speciesFactory1.getAnimal(Constants.Animals.Aquatics.WHALE);
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}
				break;
				
			case 1: 
				switch(animal) {
					case 0: try {
						a[i] =speciesFactory2.getAnimal(Constants.Animals.Birds.CROW);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 1: try {
						a[i] =speciesFactory2.getAnimal(Constants.Animals.Birds.EAGLE);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 2: try {
						a[i] =speciesFactory2.getAnimal(Constants.Animals.Birds.WOODPECKER);
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}
				break;
			
			case 2: 
				switch(animal) {
					case 0: try {
						a[i] =speciesFactory3.getAnimal(Constants.Animals.Insects.BEE);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 1: try {
						a[i] =speciesFactory3.getAnimal(Constants.Animals.Insects.BUTTERFLY);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 2: try {
						a[i] =speciesFactory3.getAnimal(Constants.Animals.Insects.COCKROACH);
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}
				break;
				
			case 3: 
				switch(animal) {
					case 0: try {
						a[i] = speciesFactory4.getAnimal(Constants.Animals.Mammals.COW);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 1: try {
						a[i] =speciesFactory4.getAnimal(Constants.Animals.Mammals.MONKEY);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 2: try {
						a[i] =speciesFactory4.getAnimal(Constants.Animals.Mammals.TIGER);
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}
				break;
				
			case 4: 
				switch(animal) {
					case 0: try {
						a[i] =speciesFactory5.getAnimal(Constants.Animals.Reptiles.CROCODILE);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 1: try {
						a[i] = speciesFactory5.getAnimal(Constants.Animals.Reptiles.SNAKE);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					case 2: try {
						a[i] =speciesFactory5.getAnimal(Constants.Animals.Reptiles.TURTLE);
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}
				break;
			}
			System.out.printf("We have an animal with %d legs!\n", a[i].getNrOfLegs());
		}
		
		Employee[] employee;
		employee = new Employee[50];
		
		for(i = 0; i<50; i++) {
			employee[i] = new Caretaker();
			System.out.println(employee[i].getName() + " " + employee[i].takeCareOf(a[i]));
		}
		String result = null;
		for(i = 0; i < 50; i++) {
			for(int j = 0; j < 50; j++) {
				if(!employee[i].getIsDead() && !a[j].getTakenCareOf()) {
					result = employee[i].takeCareOf(a[j]);
					if(result.equals(Constants.Caretakers.TCO_KILLED)) {
						System.out.println(employee[i].getName() + " has been " + result);
						employee[i].setIsDead(true);
					}
					else if(result.equals(Constants.Caretakers.TCO_NO_TIME)) {
						break;
					}
					else {
						a[i].setTakenCareOf(true);
					}
				}
			}
		}
	}
	
}
