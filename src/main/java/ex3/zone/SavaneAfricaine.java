package ex3.zone;

import ex3.HabitatPreferer;

public class SavaneAfricaine extends ZoneAnimaux{
	
	public SavaneAfricaine(HabitatPreferer habitatPreferer)
	{
		super(habitatPreferer);
	}
	
	public int calculerKgsNourritureParJour(){
		return compterAnimaux() * 10;
	}
}
