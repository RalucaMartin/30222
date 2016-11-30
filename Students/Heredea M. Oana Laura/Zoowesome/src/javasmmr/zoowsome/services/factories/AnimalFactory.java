package javasmmr.zoowsome.services.factories;

public class AnimalFactory {
public static SpeciesFactory getSpeciesFactory(String type) throws Exception{
	if (Constants.Species.Mammals.equals(type)) {
		return new MammalFactory();
	} else if (Constants.Species.Reptiles.equals(type)) {
		return new ReptilesFactory();
	} else if (Constants.Species.Birds.equals(type)) {
		return new BirdsFactory();
	} else if (Constants.Species.Insects.equals(type)) {
		return new InsectsFactory();
	} else if (Constants.Species.Aquatic.equals(type)) {
		return new AquaticFactory();
	} else
		throw new Exception("Invalid species exception");
	}

}

