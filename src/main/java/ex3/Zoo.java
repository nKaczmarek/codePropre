package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.model.Animal;
import ex3.model.TypeAlimentation;
import ex3.model.TypeAnimal;
import ex3.zone.Aquarium;
import ex3.zone.FermeReptile;
import ex3.zone.SavaneAfricaine;
import ex3.zone.ZoneAnimaux;
import ex3.zone.ZoneCarnivore;

public class Zoo {

	private String nom;
	private List<ZoneAnimaux> zone;

	public Zoo(String nom) {
		this.nom = nom;
		this.zone = new ArrayList<ZoneAnimaux>();
		ajouterZoneZoo();
	}

	private void ajouterZoneZoo() {
		zone.add(new Aquarium(new HabitatPreferer(TypeAnimal.POISSON, TypeAlimentation.HERBIVORE)));
		zone.add(new FermeReptile(new HabitatPreferer(TypeAnimal.SERPENT, TypeAlimentation.CARNIVORE)));
		zone.add(new SavaneAfricaine(new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.HERBIVORE)));
		zone.add(new ZoneCarnivore(new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE)));
	}

	public void addAnimal(Animal animal) {
		int compteur = 0;
		boolean inserer = false;
		while (!inserer && compteur < zone.size()) {
			if (zone.get(compteur).acceptAnimal(animal)) {
				zone.get(compteur).addAnimal(animal);
				inserer = true;
			} else
				compteur++;
		}
	}

	public void afficherListeAnimaux() {
		for (ZoneAnimaux zoneZoo : zone) {
			zoneZoo.afficherListeAnimaux();
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
