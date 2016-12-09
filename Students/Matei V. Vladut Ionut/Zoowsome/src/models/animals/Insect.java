package models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Insect extends Animal {
	public boolean canFly;
	public boolean isDangerous;
	

	public boolean CanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(CanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(IsDangerous()));
		}

	

}
