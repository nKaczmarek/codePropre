package ex3.zone;

import ex3.HabitatPreferer;
import ex3.model.Animal;

public class ZoneCarnivore extends ZoneAnimaux{
		
	
	public ZoneCarnivore(HabitatPreferer habitatPreferer)
	{
		super(habitatPreferer);
	}
	
	public double calculerKgsNourritureParJour(){
		return getAnimals().size() * 10;
	}
	
	public void accepterAnimal(Animal animal)
	{
		
	}
}
