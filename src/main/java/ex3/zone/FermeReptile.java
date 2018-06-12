package ex3.zone;

import ex3.HabitatPreferer;

public class FermeReptile extends ZoneAnimaux{

	public FermeReptile(HabitatPreferer habitatPreferer)
	{
		super(habitatPreferer);
	}
	
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 0.1;
	}
}
