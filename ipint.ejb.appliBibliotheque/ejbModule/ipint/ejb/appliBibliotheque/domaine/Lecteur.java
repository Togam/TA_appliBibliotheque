package ipint.ejb.appliBibliotheque.domaine;

/**
 * @author six
 *
 */
public class Lecteur {

	private int id;
	private Bibliotheque bibliotheque;

	/**
	 * Constructeur
	 */
	public Lecteur(final int id, final Bibliotheque bibliotheque) {
		this.id = id;
		this.bibliotheque = bibliotheque;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @return bibliotheque
	 */
	public Bibliotheque getBibliotheque() {
		return bibliotheque;
	}

	/**
	 * @param bibliotheque
	 */
	public void setBibliotheque(final Bibliotheque bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

}
