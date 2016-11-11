package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	
	private int avgSwimDepth;
	public enum water{ saltWater, freshWater};
	private water waterType;
	
	public int getAvgSwimDepth(){
		return this.avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public water getWaterType(){
		return this.waterType;
	}
	
	public void setWaterType(water waterType){
		this.waterType = waterType;
	}

	public Aquatic() {
		// TODO Auto-generated constructor stub
	}

}
