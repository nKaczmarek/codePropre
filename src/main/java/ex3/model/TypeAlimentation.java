package ex3.model;

public enum TypeAlimentation {

	HERBIVORE("Herbivore"),
	CARNIVORE("Carnivore");
	
	private String nom;
	
	TypeAlimentation(String nom)
	{
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
}
