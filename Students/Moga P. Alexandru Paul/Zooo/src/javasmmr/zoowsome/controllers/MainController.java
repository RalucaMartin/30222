package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animal.Animal;
import javasmmr.zoowsome.models.employees.Caretakers;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		int i,j;
		
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1=speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("we have an animal with %d legs\n",a1.getNrOfLegs());
		Animal a2=speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		System.out.printf("we have an animal with %d legs\n",a2.getNrOfLegs());
		EmployeeFactory employeeFactory = new EmployeeFactory();
		EmployeeAbstractFactory employeesFactory1 =  employeeFactory.getEmployeeAbstractFactory(Constants.Employees.CARETAKERS);
		Employee e1 =employeesFactory1.getEmployee(Constants.Employees.CARETAKERS);
		System.out.printf("we have an employee with id %d \n",e1.getId());
		Employee e2 = employeesFactory1.getEmployee(Constants.Employees.CARETAKERS);
		System.out.printf("we have an employee with id %d \n",e2.getId());
		
		Employee e[] = {e1,e2};
		Animal a[] = {a1,a2};
		String result;
		for(i=0; i<=e.length-1; i++)
		{
			for(j=i; j<=a.length-1; j++)
			{
				if(!(e[j].isDead() && a[i].getTakenCareOf()))
				{
					result = ((Caretakers) e[j]).takeCareOf(a[i]);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						System.out.println("The caretaker is dead");
						e[j].setDead(true);
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
		for(i=0; i<=e.length; i++)
		{
			if(!(a[i].getTakenCareOf()))
			{
					System.out.printf("Not all animals have been take care of");
					break;
		}
			else{
				System.out.printf("All animals have been take care of");
			}

	}

}
}
