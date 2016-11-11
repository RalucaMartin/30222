package models.animals;

public class Tuna extends Aquatic{

	private float lenght;
	/*
	public Tuna(){
		nrOfLegs = 0;
		name = "Tuna";
		avgSwimDepth = 100;
		setLenght(2);
	}
	*/
	
	public Tuna(float lenght, int avgSwimDepth ){
		super(0.3, 0.1);
		setName("Tuna");
		setNrOfLegs(0);
		this.setLenght(lenght);
		this.avgSwimDepth = avgSwimDepth;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	
}
