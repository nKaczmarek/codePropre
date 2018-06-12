package ex2;

/**
 * Représente un livret A 
 * Hérite CompteBancaire
 * 
 * @author nKaczmarek
 *
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * permet d'appliquer la rémunération annuelle
	 */
	public void appliquerRemuAnnuelle() {
		double soldeLivretA = this.getSolde();
		this.setSolde(soldeLivretA + soldeLivretA * tauxRemuneration / 100);
	}

}
