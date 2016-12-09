package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Whale extends Aquatic {
	
	public Whale(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Whale(){
		this.setNrOfLegs(0);
		this.setName("Whale");
		this.setAvgSwimDepth(900);
		this.setWaterType(waterType.saltwater);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.9);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
 	 	super.encodeToXml(eventWriter);  	 	
 	 	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.WHALE); 
 	}
}
