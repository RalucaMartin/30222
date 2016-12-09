package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;

	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public Boolean isFlying() {
		return this.canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

	public Boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public void getDetails() {
		System.out.println("********************************************************");
		System.out.println("New animal in the ZOO : " + getName());
		System.out.println(getName() + " has " + getNrOfLegs() + " legs");
		if (isFlying()) {
			System.out.println(getName() + " can fly");
		} else {
			System.out.println(getName() + " can't fly");
		}
		if (getIsDangerous()) {
			System.out.println("It's a dangerous insect! (sometimes)");
		} else {
			System.out.println("Don't worry!It isn't a dangerous insect!");
		}
		System.out.println("*******************************************************");
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(isFlying()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
