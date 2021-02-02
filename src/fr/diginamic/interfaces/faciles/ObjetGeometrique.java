package fr.diginamic.interfaces.faciles;

/**
 * Liste les m�thodes obligatoires que doit poss�der un objet g�om�trique
 * 
 * @author Antoine
 */
public interface ObjetGeometrique {
	/**
	 * Retourne le p�rim�tre d�une forme g�om�trique
	 * 
	 * @return double
	 */
	double perimetre();

	/**
	 * Retourne la surface
	 * 
	 * @return double
	 */
	double surface();
}