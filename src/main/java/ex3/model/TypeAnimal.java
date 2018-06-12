package ex3.model;

public enum TypeAnimal {
	MAMMIFERE("Mammifère"),
	POISSON("Poisson"),
	SERPENT("Serpent");
	
	private String nom;
	
	TypeAnimal(String nom)
	{
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
}
