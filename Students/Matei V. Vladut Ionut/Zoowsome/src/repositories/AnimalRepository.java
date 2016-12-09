package repositories;

import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import	models.animals.*;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import models.animals.Animal;
import models.animals.Constants;
import models.interfaces.XML_Parsable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// Create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		// Create a EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		// Create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		// Create content open tag
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (XML_Parsable animal : animals) {
		StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
		eventWriter.add(sElement);
		eventWriter.add(end);
		animal.encodeToXml(eventWriter);
		EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
		eventWriter.add(eElement);
		eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
		}
	
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
		Node node = nodeList.item(i);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
		Element element = (Element) node;
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
			case Constants.Animals.Insects.BUTTERFLY:
				Animal butterfly = new Butterfly();
				butterfly.decodeFromXml(element);
				animals.add(butterfly);
			case Constants.Animals.Insects.COCKROACH:
				Animal cockroach = new Cockroach();
				cockroach.decodeFromXml(element);
				animals.add(cockroach);
			case Constants.Animals.Insects.SPIDER:
				Animal spider = new Spider();
				spider.decodeFromXml(element);
				animals.add(spider);
			case Constants.Animals.Birds.CHICKEN:
				Animal chicken = new Chicken();
				chicken.decodeFromXml(element);
				animals.add(chicken);
			case Constants.Animals.Birds.EAGLE:
				Animal eagle = new Eagle();
				eagle.decodeFromXml(element);
				animals.add(eagle);
			case Constants.Animals.Birds.WAXWING:
				Animal waxwing = new Butterfly();
				waxwing.decodeFromXml(element);
				animals.add(waxwing);
			case Constants.Animals.Mammals.COW:
				Animal cow = new Cow();
				cow.decodeFromXml(element);
				animals.add(cow);
			case Constants.Animals.Mammals.MONKEY:
				Animal monkey = new Monkey();
				monkey.decodeFromXml(element);
				animals.add(monkey);
			case Constants.Animals.Mammals.TIGER:
				Animal tiger = new Tiger();
				tiger.decodeFromXml(element);
				animals.add(tiger);
			case Constants.Animals.Reptiles.CROCODILE:
				Animal crocodile = new Crocodile();
				crocodile.decodeFromXml(element);
				animals.add(crocodile);
			case Constants.Animals.Reptiles.LIZZARD:
				Animal lizzard = new Lizzard();
				lizzard.decodeFromXml(element);
				animals.add(lizzard);
			case Constants.Animals.Reptiles.TURTLE:
				Animal turtle = new Turtle();
				turtle.decodeFromXml(element);
				animals.add(turtle);
			case Constants.Animals.Aquatics.SALMON:
				Animal salmon = new Salmon();
				salmon.decodeFromXml(element);
				animals.add(salmon);
			case Constants.Animals.Aquatics.SHARK:
				Animal shark = new Shark();
				shark.decodeFromXml(element);
				animals.add(shark);
			case Constants.Animals.Aquatics.WHALE:
				Animal whale = new Whale();
				whale.decodeFromXml(element);
				animals.add(whale);
		default:
			break;
		}
		}
		}
		return animals;
		}
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
		}
}
