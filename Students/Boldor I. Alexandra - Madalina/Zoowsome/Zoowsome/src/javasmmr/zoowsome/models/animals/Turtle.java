package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Turtle extends Reptile {
	public Turtle(int nrOfLegs, String name, Boolean laysEggs, double maintenanceCost, double dangerPerc) {

		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Turtle() {
		this(4, "Broscuta", true, 0.5, 0.1);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Turtle);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}

}
