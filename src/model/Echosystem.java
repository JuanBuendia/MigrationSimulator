package model;

import java.util.ArrayList;

public class Echosystem {

	private ArrayList<Specie> listSpecies;
	
	public Echosystem() {
		listSpecies = new ArrayList<>();
	}

	public static Specie createSpecie( String name, int lifeCicle, int adaptability, int groundKnowledge) {
		return new Specie(name, lifeCicle, adaptability, groundKnowledge);
	}
	
	public void addSpecie(Specie specie) {
		listSpecies.add(specie);
	}
	
	public void incrementSurvivalRate() {
		for (Specie specie : listSpecies) {
			int x = specie.getAdaptability() / 10;
			specie.setLifeCicle(x);
		}
	}
	
	public void giveBirth() {
		for (Specie specie : listSpecies) {
			specie.giveBirth();
		}
	}
	
	public void checkNaturalDead() {
		for (Specie specie : listSpecies) {
			specie.naturalDead();
		}
	}
	
	public Animal createAnimal() {
		return Specie.createAnimal();
	}
	
	public void addAnimal(Specie specie, Animal animal) {
		if (listSpecies.contains(specie)) {
			specie.addAnimal(animal);
		}	
	}
	
	public void impregnateAnimals() {
		for (Specie specie : listSpecies) {
			specie.impregnateAnimals();
		}
	}
	
	public void moveAnimals() {
		for (Specie specie : listSpecies) {
			specie.moveAnimals();
		}
	}
	
	public void incrementAnimalAge() {
		for (Specie specie : listSpecies) {
			specie.incrementAnimalsAge();
		}
	}
	
	public ArrayList<Animal> getAnimals(Specie specie){
		if (listSpecies.contains(specie)) {
			return specie.getAnimals();
		}
		return null;
	}
	
	public ArrayList<Specie> getListSpecies() {
		return listSpecies;
	}
	
	public String reportSpecies() {
		String report = null;
		for (Specie specie : listSpecies) {
			report += specie.reportAnimals();
		}
		return report;
	}
}