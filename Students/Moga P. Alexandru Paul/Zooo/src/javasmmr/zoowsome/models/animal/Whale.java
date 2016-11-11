package javasmmr.zoowsome.models.animal;

import javasmmr.zoowsome.models.animal.Aquatic.Enum;

public class Whale extends Aquatic{

	public Whale() {
		super();
		// TODO Auto-generated constructor stub
		this.setNrOfLegs(0);
		this.setName("Whale");
		this.setAvgSwimDetpth(3000);
		this.setWaterType(Enum.saltwater);
	}
	

}
