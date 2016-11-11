package services.factories;

public class AnimalFactory {

	public SpeciesFactory getSpeciesFactory(String type){
		
		if (Constants.Species.MAMMALS.equals(type)){
			return new MammalFactory();
		} else if(Constants.Species.REPTILES.equals(type)){
			return new ReptileFactory();
		} else if (Constants.Species.INSECTS.equals(type)){
			return new InsectFactory();
		} else if (Constants.Species.BIRDS.equals(type)){
			return new BirdsFactory();
		} else if (Constants.Species.AQUATICS.equals(type)){
			return new AquaticFactory();
		} else return new AquaticFactory(); //trebuie midifcat !!!
			
	}
}
