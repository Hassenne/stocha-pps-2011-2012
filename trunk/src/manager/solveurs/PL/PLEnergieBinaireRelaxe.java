package manager.solveurs.PL;

import manager.solveurs.Solveur;

import data.DataBinaire;
import data.solution.SolutionEnergieBinaire;

/**
 * Cette classe permet d'�crire un programme lin�aire � partir de donn�es pour le probl�me de management de la production d'�nergie.
 * Ce PL est utilis� par un solveur de programmes lin�aires.
 * @author Fabien BINI & Nathana�l MASRI & Nicolas POIRIER
 * 
 */
public abstract class PLEnergieBinaireRelaxe implements Solveur {

	/** Variable contenant les donn�es du probl�me */
	protected DataBinaire donnees;
	/** Le vecteur de solution du probl�me */
	protected SolutionEnergieBinaire solution;
	/** Le vecteur de co�ts */
	protected double[] couts;
	/** La matrice pour l'unicit� du palier de production thermique par centrale */
	protected int[][] h;
	/** Le vecteur pour l'unicit� de la trajectoire d'utilisation de l'eau */
	protected int[] u;
	/** Les probabilit�s des sc�narios */
	protected double[] probabilites;
	/** La matrice qui pour chaque sc�nario et chaque p�riode associe la liste des paliers de production et les trajectoires */
	protected double[][][] productions;
	
	/**
	 * Cr�e un nouveau PLEnergie.
	 * @param donnees les donn�es du probl�me
	 */
	public PLEnergieBinaireRelaxe(DataBinaire donnees)
	{
		genererPL();
	}

	/**
	 * G�n�re le programme lin�aire de la p-mediane � partir des donn�es.
	 * Remplit les tableaux du probl�me.
	 */
	private void genererPL()
	{
		
	}
	
	/**
	 * Renvoie la solution calcul�e.
	 * @return la solution calcul�e
	 */
	public SolutionEnergieBinaire getSolution() {
		return null;
	}
	
	public abstract void lancer();
}
