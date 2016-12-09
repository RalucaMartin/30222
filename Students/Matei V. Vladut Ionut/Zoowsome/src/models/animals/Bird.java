package models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Bird extends Animal {
	public boolean migrates;
	public int avgFlightAltitude;
	
	public boolean doesMigrates() {
		return migrates;
	}
	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(doesMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
		}

}
