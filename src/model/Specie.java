package model;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Specie {

	private int id;
	private String name;
	private int lifeCicle;
	private int adaptability;
	private int groundKnowledge;
	private ArrayList<Animal> animals;
	private Queue<Animal> pregnancyQueue;
	private LinkedList<Animal> animalGroup;
	
	public Specie(int id, String name, int lifeCicle, int adaptability, int groundKnowledge) {
		this.id = id;
		this.name = name;
		this.lifeCicle = lifeCicle;
		this.adaptability = adaptability;
		this.groundKnowledge = groundKnowledge;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setLifeCicle(int lifeCicle) {
		this.lifeCicle = lifeCicle;
	}

	public void setAdaptability(int adaptability) {
		this.adaptability = adaptability;
	}

	public void setGroundKnowledge(int groundKnowledge) {
		this.groundKnowledge = groundKnowledge;
	}

	public int getLifeCicle() {
		return lifeCicle;
	}

	public int getAdaptability() {
		return adaptability;
	}

	public int getGroundKnowledge() {
		return groundKnowledge;
	}

	public Queue<Animal> getPregnancyQueue() {
		return pregnancyQueue;
	}

	public LinkedList<Animal> getAnimalGroup() {
		return animalGroup;
	}
	
	public static Animal createAnimal() {
		return new Animal((int) (Math.random() * 100));
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	@Override
	public String toString() {
		return "Specie [id=" + id + ", name=" + name + ", lifeCicle=" + lifeCicle + ", adaptability=" + adaptability
				+ ", groundKnowledge=" + groundKnowledge + "]";
	}
}