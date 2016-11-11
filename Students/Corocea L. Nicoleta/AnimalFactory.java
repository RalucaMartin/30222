package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.utils.Constants;
//import javasmmr.zoowsome.utils.Constants.Species;

public class AnimalFactory {
	public SpeciesFactory getSpeciesFactory(String type) {
		if (Constants.Species.Mammals.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.Reptiles.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.Birds.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.Insects.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.Aquatics.equals(type)) {
			return new AquaticFactory();
		} else
			System.out.println("Invalid animal exception!");
		// throw new Exception("Invalid species exception");
		return null;
	}
}
