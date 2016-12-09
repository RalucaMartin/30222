package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Frog extends Aquatic {
	
	public Frog(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Frog(){
		this.setNrOfLegs(4);
		this.setName("Frog");
		this.setAvgSwimDepth(66);
		this.setWaterType(waterType.freshwater);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.4);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
 	 	super.encodeToXml(eventWriter);  	 	
 	 	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.FROG); 
 	}
}
