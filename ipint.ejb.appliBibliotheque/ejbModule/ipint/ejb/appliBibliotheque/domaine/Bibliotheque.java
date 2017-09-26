package ipint.ejb.appliBibliotheque.domaine;

import java.util.List;

/**
 * @author six
 *
 */
public class Bibliotheque {

	private List<Livre> livres;
	private List<Lecteur> lecteurs;

	public Bibliotheque() {

	}

	/**
	 * @return liste des livres de la bibliothèqe
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/**
	 * @param livres
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	/**
	 * @return liste des lecteurs de la bibliothèque
	 */
	public List<Lecteur> getLecteurs() {
		return lecteurs;
	}

	/**
	 * @param lecteurs
	 */
	public void setLecteurs(List<Lecteur> lecteurs) {
		this.lecteurs = lecteurs;
	}

}
