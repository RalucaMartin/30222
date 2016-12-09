package javasmmr.zoowsome.models.animal;

public class Lizard extends Reptile {

		public Lizard() {
			this("Lizard",4,true);
		}

		public Lizard(String name, int nrOfLegs, boolean layEggs){
			super(0.1, 0.1);
			setName(name);
			setNrOfLegs(nrOfLegs);
			setLaysEggs(layEggs);
		}
	
}
