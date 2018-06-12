package ex3.model;

import ex3.HabitatPreferer;

public class Animal {

	private String nom;
	private HabitatPreferer habitat;
	
	public Animal(String nom, HabitatPreferer habitat)
	{
		this.nom = nom;
		this.setHabitat(habitat);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HabitatPreferer getHabitat() {
		return habitat;
	}

	public void setHabitat(HabitatPreferer habitat) {
		this.habitat = habitat;
	}
	
}
