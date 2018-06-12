package ex3.zone;

import java.util.ArrayList;
import java.util.List;

import ex3.HabitatPreferer;
import ex3.model.Animal;
import ex3.model.TypeAlimentation;
import ex3.model.TypeAnimal;

public class ZoneAnimaux {
	private List<Animal> animals;
	private HabitatPreferer typeHabitat;
	
	public ZoneAnimaux()
	{
		this.animals = new ArrayList<Animal>();
	}
	
	public ZoneAnimaux(HabitatPreferer habitatPreferer)
	{
		this.animals = new ArrayList<Animal>();
		typeHabitat = habitatPreferer;
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal : animals){
			System.out.println(animal.getNom());
		}
	}
	
	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public void addAnimal(Animal animal)
	{
		animals.add(animal);
	}
	
	public boolean acceptAnimal(Animal animal)
	{
		if(animal.getHabitat().equals(typeHabitat))
			return true;
		else
			return false;
	}
	/*
	public static void main(String[] args)
	{
		Animal a = new Animal("test", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE));
		Animal b = new Animal("test2", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE));
		Animal c = new Animal("test3", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE));
		Animal d = new Animal("test4", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE));
		Animal e = new Animal("test5", new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE));
		
		HabitatPreferer typeHabitat = new HabitatPreferer(TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE);
		ZoneCarnivore zc = new ZoneCarnivore(typeHabitat);
		
		if(zc.acceptAnimal(a))
			zc.addAnimal(a);
		zc.acceptAnimal(b);
		zc.acceptAnimal(c);
		zc.acceptAnimal(d);
		zc.acceptAnimal(e);
		
		zc.afficherListeAnimaux();
	}
	*/
}
