package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Fish;
import javasmmr.zoowsome.models.animals.KomodoDragon;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Swan;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Vulture;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository {

	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {

	}

	// saves an array list of animals to an .xml file
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

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException { // loads an array list of animals from
		                                                                                             // the same file
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
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
		    			break;
		    		
		    		case Constants.Animals.Insects.COCKROACH:
		    			Animal cockroach = new Cockroach();
		    			cockroach.decodeFromXml(element);
		    			animals.add(cockroach);
		    			break;
		    		
		    		case Constants.Animals.Insects.SPIDER:
		    			Animal spider = new Spider();
		    			spider.decodeFromXml(element);
		    			animals.add(spider);
		    			break;
		    			
		    		case Constants.Animals.Birds.OWL:
		    			Animal owl = new Owl();
		    			owl.decodeFromXml(element);
		    			animals.add(owl);
		    			break;
		    			
		    		case Constants.Animals.Birds.SWAN:
		    			Animal swan = new Swan();
		    			swan.decodeFromXml(element);
		    			animals.add(swan);
		    			break;
		    		
		    		case Constants.Animals.Birds.VULTURE:
		    			Animal vulture = new Vulture();
		    			vulture.decodeFromXml(element);
		    			animals.add(vulture);
		    			break;
		    		
		    		case Constants.Animals.Aquatics.FISH:
		    			Animal fish = new Fish();
		    			fish.decodeFromXml(element);
		    			animals.add(fish);
		    			break;
		    		
		    		case Constants.Animals.Aquatics.OCTOPUS:
		    			Animal octopus = new Octopus();
		    			octopus.decodeFromXml(element);
		    			animals.add(octopus);
		    			break;
		    			
		    		case Constants.Animals.Aquatics.SHARK:
		    			Animal shark = new Shark();
		    			shark.decodeFromXml(element);
		    			animals.add(shark);
		    			break;
		    			
		    		case Constants.Animals.Mammals.COW:
		    			Animal cow = new Cow();
		    			cow.decodeFromXml(element);
		    			animals.add(cow);
		    			break;
		    		
		    		case Constants.Animals.Mammals.MONKEY:
		    			Animal monkey = new Monkey();
		    			monkey.decodeFromXml(element);
		    			animals.add(monkey);
		    			break;
		    			
		    		case Constants.Animals.Mammals.TIGER:
		    			Animal tiger = new Tiger();
		    			tiger.decodeFromXml(element);
		    			animals.add(tiger);
		    			break;
		    			
		    		case Constants.Animals.Reptiles.KOMODODRAGON:
		    			Animal komododragon = new KomodoDragon();
		    			komododragon.decodeFromXml(element);
		    			animals.add(komododragon);
		    			break;
		    			
		    		case Constants.Animals.Reptiles.LIZZARD:
		    			Animal lizzard = new Lizzard();
		    			lizzard.decodeFromXml(element);
		    			animals.add(lizzard);
		    			break;
		    			
		    		case Constants.Animals.Reptiles.SNAKE:
		    			Animal snake = new Snake();
		    			snake.decodeFromXml(element);
		    			animals.add(snake);
		    			break;

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
