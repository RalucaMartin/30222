package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {

	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Cockroach() {
		this(6, "Cockroach", false, false, 2, 0.1);
	}
    
	@Override
	public double getPredisposition() {
		//for twist
		//I left this method empty because I don't know yet exactly how to implement it in the animal class more efficient
		//so it returns sth specific to each animal
		return 0;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.COCKROACH);

	}
	
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
