package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Octopus extends Aquatic {
	public Octopus(int nrOfLegs, String name, int avgSwimDepth, water waterType, double maintenanceCost,
			double dangerPerc) {

		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	public Octopus() {
		this(8, "Caracatita", 1000, water.saltwater, 0.5, 1);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Octopus);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}
}
