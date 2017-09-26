package ipint.ejb.appliBibliotheque.domaine;

/**
 * @author six
 *
 */
public class Livre {

	private String titre;
	private String nomAuteur;
	private Bibliotheque bibliotheque;

	public Livre(final String titre, final String nomAuteur, final Bibliotheque bibliotheque) {
		this.titre = titre;
		this.setNomAuteur(nomAuteur);
		this.setBibliotheque(bibliotheque);
	}

	/**
	 * @return titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre
	 */
	public void setTitre(final String titre) {
		this.titre = titre;
	}

	/**
	 * @return nom de l'auteur du livre
	 */
	public String getNomAuteur() {
		return nomAuteur;
	}

	/**
	 * @param nomAuteur
	 */
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	/**
	 * @return la bibliothèque
	 */
	public Bibliotheque getBibliotheque() {
		return bibliotheque;
	}

	/**
	 * @param bibliotheque
	 */
	public void setBibliotheque(Bibliotheque bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

}
