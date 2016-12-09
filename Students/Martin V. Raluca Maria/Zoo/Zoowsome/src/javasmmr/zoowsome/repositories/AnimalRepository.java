package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Flamingo;
import javasmmr.zoowsome.models.animals.Gull;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turacos;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

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



public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);		
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name,String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		//Create Start node
		StartElement sElement = eventFactory.cretateStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		//Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		//Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
				
	}
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant) {
		case Constants.Animal.Insect.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
			break;
		case Constants.Animal.Insect.Cockroach:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;
			break;
		case Constants.Animal.Insect.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
			break;
		case Constants.Animal.Aquatic.Dolphin:
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
			break;
		case Constants.Animal.Aquatic.Octopus:
			Animal octopus = new Octopus();
			octopus.decodeFromXml(element);
			return octopus;
			break;
		case Constants.Animal.Aquatic.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
			break;
		case Constants.Animal.Bird.Gull:
			Animal gull = new Gull();
			gull.decodeFromXml(element);
			return gull;
			break;
		case Constants.Animal.Bird.Flamingo:
			Animal flamingo = new Flamingo();
			flamingo.decodeFromXml(element);
			return flamingo;
			break;
		case Constants.Animal.Bird.Turacos:
			Animal turacos = new Turacos();
			turacos.decodeFromXml(element);
			return turacos;
			break;
		case Constants.Animal.Mammal.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
			break;
		case Constants.Animal.Mammal.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
			break;
		case Constants.Animal.Mammal.Monkey:
			Animal Monkey = new Monkey();
			Monkey.decodeFromXml(element);
			return Monkey;
			break;
		case Constants.Animal.Reptile.Lizzard:
			Animal lizzard = new Lizzard();
			lizzard.decodeFromXml(element);
			return lizzard;
			break;
		case Constants.Animal.Reptile.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
			break;
		case Constants.Animal.Reptile.Crocodile:
			Animal crocodile = new Crocodile();
			crocodile.decodeFromXml(element);
			return crocodile;
			break;		
			default:
					break;
		}
		return null;
		}
	}
	
	

