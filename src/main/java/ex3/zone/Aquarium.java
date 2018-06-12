package ex3.zone;

import ex3.HabitatPreferer;

public class Aquarium extends ZoneAnimaux{

	public Aquarium(HabitatPreferer habitatPreferer)
	{
		super(habitatPreferer);
	}
	
	public double calculerKgsNourritureParJour(){
		return getAnimals().size() * 0.2;
	}
}
