package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public Boolean isLayingEggs() {
		return this.laysEggs;
	}

	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public void getDetails() {
		System.out.println("********************************************************");
		System.out.println("New animal in the ZOO : " + getName());
		System.out.println(getName() + " has " + getNrOfLegs() + " legs");
		if (isLayingEggs()) {
			System.out.println(getName() + " lays eggs");
		}
		System.out.println("*******************************************************");
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(isLayingEggs()));
	}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
