package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;

	public enum water {
		saltwater, freshwater
	};

	private water waterType;

	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public water getWaterType() {
		return this.waterType;
	}

	public void setWaterType(water waterType) {
		this.waterType = waterType;
	}

	public void getDetails() {
		System.out.println("********************************************************");
		System.out.println("New animal in the ZOO : " + getName());
		System.out.println(getName() + " has " + getNrOfLegs() + " tentacles");
		System.out.println(getName() + " preferes " + getWaterType());
		System.out.println("Its average swim depth is " + getAvgSwimDepth() + " meters");
		System.out.println("*******************************************************");
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
