package ex3;

public class Livre {
	String titre, auteur;
	private float nbPages;
	private double prix ; 
	private boolean prixFixe = false ; 
	
	public double getPrix() {
		return prix ; 
	}
	
	public boolean testPrix() {
		return prix > 0 ;
	}
	
	public void setPrix(double prix) {
		if(!prixFixe) {
			this.prix = prix ;
			this.prixFixe = true ;
			
		}else {
			System.out.println("le prix a deja fixe et ne peut pas etre modifie");
		}
	}
	public void  livre (String auteur,String  titre) {
	this.auteur = auteur;
	this.titre = titre;
	}
	public String getAuteur() {
	return auteur;
	}
	public void setNbPages (float nb) {
		if (nb>20) {
			this.nbPages = nb;
		}else {
			System.out.println("le nombre indique est faible");
		}
	
	}
	public String getTitre() {
		return titre;
	}
	public float getNbpages() {
		return nbPages;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
		
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String toString() {
		 String prixInfo = prixFixe? ",au prix de "+prix + "euros " : "prix non fixe";
		/* j ai utuilise une fonction 'ternaire ou il ya 2 valeaurs on conditions d'une condition*/
		return "livre intitule "+titre+" de "+auteur+" contenant "+(int)nbPages+" pages" + prixInfo;
	}
	public void decrire() {
		System.out.println(this.toString());
	}
	public Livre() {
		this.nbPages = 0 ; 
	}
	public Livre (String titre , float nbPages) {
		this.titre = titre ; 
		this.nbPages = nbPages;
	}
	public Livre (String titre , float nbPages , String auteur , double prix) {
		this.titre = titre ; 
		this.nbPages = nbPages;
		this.auteur = auteur ; 
		this.prix = prix ; 
	}
	

}
