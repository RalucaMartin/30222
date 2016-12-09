package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Tortoise extends Reptile{
	
	public Tortoise(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Tortoise(){
		this.setNrOfLegs(4);
		this.setName("Tortoise");
		this.setLaysEggs(true);
		this.setMaintenanceCost(1.5);
		this.setDangerPerc(0.4);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
 	 	super.encodeToXml(eventWriter);  	 	
 	 	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.TORTOISE); 
 	}
}
