package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Employees.Caretakers;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		Animal a2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.MONKEY);
		System.out.printf("We have an animal with %d legs!\n", a2.getNrOfLegs());
		
		EmployeeFactory employeeFactory = new EmployeeFactory();
		EmployeeAbstractFactory employeeFactory1 = employeeFactory.getEmployeeAbstractFactory(Constants.Employees.CARETAKER);
		
		Employee c1 = employeeFactory1.getEmployee(Constants.Employees.CARETAKER);
		System.out.printf("We have an employee with %d id!\n", c1.getId());
		
		Employee c2 = employeeFactory1.getEmployee(Constants.Employees.CARETAKER);
		System.out.printf("We have an employee with %d id!\n", c2.getId());
		
		Animal a[] = {a1, a2};
		Employee c[] = {c1, c2};
		Caretakers result;
		
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < a.length; i++){
				if (!(c[i].getIsDead() && a[j].getTakenCareOf())){
					result = ((Caretakers) c[i].takenCareOf(a[j]));
					System.out.println("The caretaker is dead");
					c[i].setIsDead(true);
				}
				else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
					continue;
				}
				else{
					a[i].setTakenCareOf(true);
				}
			}
		}
	}
}
