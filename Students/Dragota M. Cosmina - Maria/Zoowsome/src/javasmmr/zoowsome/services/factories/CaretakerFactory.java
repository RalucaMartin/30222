package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.*;


public class CaretakerFactory extends EmployeeFactory{

	public EmployeeFactory getEmployeeFactory (String type) throws Exception{
		if(Constants.Caretakers.BIRD_KEEPER.equals(type)){
			return new BirdKeeper();
		}else if(Constants.Caretakers.AQUATIC_KEEPER.equals(type)){
			//return new AqaticKeeper();
		}else if(Constants.Caretakers.MAMMAL_KEEPER.equals(type)){
			//return new MammalKeeper();
		}else if(Constants.Caretakers.REPTILE_KEEPER.equals(type)){
			//return new ReptileKeeper();
		}else{
			throw new Exception("Invalid caretaker exception!");
		}
	}
	
	
	public CaretakerFactory() {
		// TODO Auto-generated constructor stub
	}

}
