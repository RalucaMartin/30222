package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Constants;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception  {
		int i,j;

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		
		Animal a1=speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
		System.out.printf("we have an animal with %d legs\n",a1.getNrOfLegs());
		
		Animal a2=speciesFactory1.getAnimal(Constants.Animals.Mammals.COW);
		System.out.printf("we have an animal with %d legs\n",a2.getNrOfLegs());
		CaretakerFactory employeeFactory = new CaretakerFactory();
		
		Employee e1 =  employeeFactory.getEmployee(Constants.Employees.CARETAKER);
		System.out.printf("we have an employee with id %d \n",e1.getId());
		
		Employee e2 =  employeeFactory.getEmployee(Constants.Employees.CARETAKER);
		System.out.printf("we have an employee with id %d \n",e2.getId());

		Employee e[] = {e1,e2};
		Animal a[] = {a1,a2};
		String result;
		for(i=0; i<=e.length-1; i++)
		{
			for(j=i; j<=a.length-1; j++)
			{
				if(!(e[j].getIsDead() && a[i].isTakenCareOf()))
				{
					result = ((Caretaker) e[j]).takeCareOf(a[i]);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						System.out.println("The caretaker is dead");
						e[j].setIsDead(true);
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
		for(i=0; i<=a.length; i++)
		{
			if(a[i].isTakenCareOf())
			{
				System.out.printf("All animals have been take care of");
				break;
			}
		}

	}
}