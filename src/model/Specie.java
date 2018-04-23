package model;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Specie {

	private int id;
	private String name;
	private int lifeCicle;
	private static int count;
	private int adaptability;
	private int groundKnowledge;
	private ArrayList<Animal> animals;
	private LinkedList<Animal> animalGroup;
	private LinkedList<Animal> pregnancyQueue;
	
	public Specie(String name, int lifeCicle, int adaptability, int groundKnowledge) {
		this.name = name;
		this.id = count++;
		this.lifeCicle = lifeCicle;
		animals = new ArrayList<>();
		animalGroup = new LinkedList<>();
		this.adaptability = adaptability;
		pregnancyQueue = new LinkedList<>();
		this.groundKnowledge = groundKnowledge;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setLifeCicle(int increment) {
		if (increment > 5) {
			this.lifeCicle = lifeCicle + increment;
		}
	}

	public void setAdaptability(int adaptability) {
		this.adaptability = adaptability;
	}

	public void setGroundKnowledge(int groundKnowledge) {
		this.groundKnowledge = groundKnowledge;
	}
	
	public void naturalDead() {
		for (Animal animal : animals) {
			if (animal.getAge() >= lifeCicle) {
				animal.setStatus(Status.DEAD);
				animalGroup.remove(animal);
			}
		}
	}
	
	public boolean checkStatus() {
		if (animalGroup.isEmpty()) {
			return true;
		}
		return false;
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

	public static Animal createAnimal() {
		return new Animal(pos(), gender(), pos(), pos());
	}
	
	public static int pos() {
		return (int) (Math.random() * 100);
	}
	
	public static Gender gender() {
		int x =(int) Math.random() * 2;
		if(x == 0) {
			return Gender.MALE;
		}else {
			return Gender.FEMALE;
		}
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
		animalGroup.add(animal);
	}
	
	public void impregnateAnimals() {
		for (Animal animal : animalGroup) {
			if(animal.getGender() == Gender.FEMALE && animal.getStatus() == Status.MATURE) {
				animal.setStatus(Status.PREGNANT);
				pregnancyQueue.add(animal);
			}
		}
	}
	
	public void giveBirth() {
		for (Animal animal : animalGroup) {
			if(animal.getStatus() == Status.PREGNANT) {
				animal.setStatus(Status.MATURE);
				addAnimal(createAnimal());
			}
		}
	}
	
	public void exileAnimal() {
		for (Animal animal : animals) {
			if (Math.random() * groundKnowledge == Math.random() * groundKnowledge) {
				animal.setStatus(Status.EXILED);
			}
		}
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

	public String reportAnimals() {
		String specie = String.valueOf(id);
		for (Animal animal : animals) {
			specie =  "\n" +animal.toString();
		}
		return specie;
	}

	public void incrementAnimalsAge() {
		for (Animal animal : animals) {
			animal.incrementAge();
		}
	}
	
	public LinkedList<Animal> getAnimalGroup() {
		return animalGroup;
	}
	
	public Queue<Animal> getPregnancyQueue() {
		return pregnancyQueue;
	}

	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	
	@Override
	public String toString() {
		return "Specie [id=" + id + ", name=" + name + ", lifeCicle=" + lifeCicle + ", adaptability=" + adaptability
				+ ", groundKnowledge=" + groundKnowledge + "]";
	}
}