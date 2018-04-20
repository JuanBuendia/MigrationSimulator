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
		animals = new ArrayList<>();
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
	
	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	
	public static Animal createAnimal() {
		return new Animal(pos(),(int) pos());
	}
	
	public static int pos() {
		return (int) (Math.random() * 100);
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void moveAnimals() {
		for (Animal animal : animals) {
			animal.moveX();
			animal.moveY();
		}
	}
	
	public void verifyAge() {
		for (Animal animal : animals) {
			if(animal.getAge() >= 24 && animal.getAge() <= 36 ) {
				animal.setStatus(Status.MATURE);
			}
		}
	}

	@Override
	public String toString() {
		return "Specie [id=" + id + ", name=" + name + ", lifeCicle=" + lifeCicle + ", adaptability=" + adaptability
				+ ", groundKnowledge=" + groundKnowledge + "]";
	}
}