package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Monkey extends Mammal {
	
	public Monkey(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Monkey(){
		this.setNrOfLegs(4);
		this.setName("Monkey");
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(90);
		this.setMaintenanceCost(6.5);
		this.setDangerPerc(0.6);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
 	 	super.encodeToXml(eventWriter);  	 	
 	 	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.MONKEY); 
 	}
}
