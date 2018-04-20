package model;

import java.util.ArrayList;

public class Echosystem {

	private ArrayList<Specie> listSpecies;
	
	public Echosystem() {
		listSpecies = new ArrayList<>();
	}

	public static Specie createSpecie(int id, String name, int lifeCicle, int adaptability, int groundKnowledge) {
		return new Specie(id, name, lifeCicle, adaptability, groundKnowledge);
	}
	
	public void addSpecie(Specie specie) {
		listSpecies.add(specie);
	}
	
	public ArrayList<Specie> getListSpecies() {
		return listSpecies;
	}
	
	public Animal createAnimal() {
		return Specie.createAnimal();
	}
	
	public void addAnimal(Specie specie, Animal animal) {
		if (listSpecies.contains(specie)) {
			specie.addAnimal(animal);
		}	
	}
}