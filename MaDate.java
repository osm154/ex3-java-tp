package travail;
import java.util.Scanner;

public class MaDate {
	private int jour;
	private int mois;
	private int annee;
	
	public MaDate (int jour , int mois , int annee) {
		this.jour = jour;
		this.mois = mois ;
		this.annee = annee;
	}
	public MaDate (int annee) {
		this.jour = 1;
		this.mois = 1 ;
		this.annee = annee ; 
	}
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	public int getAnnee() {
		return annee; 
	}
	public void setJour(int jour) {
		this.jour = jour ;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public String toString() {
		return jour + "/"  + mois +"/" + annee ; 
	}
	public void ajouterUnJour() {
		jour ++ ;
		if (( mois == 2 && jour > 28 )|| jour > 30 && ( mois == 4 || mois == 6 || mois == 9 || mois == 11)|| jour>31){
			jour = 1;
			ajouterUnMois();
		}
	}
	/* je ne fais pas le control de l 'annee si elle bisextile ou non */
	public void ajouterPlusieursJours(int n) {
		for(int i = 0 ; i< n ; i++) {
			ajouterUnJour();
		}
	}
	public void ajouterUnMois() {
		mois++;
		if(mois > 12) {
			mois = 1;
			ajouterUnAn();
		}
	}
	public void ajouterUnAn() {
		annee ++ ;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        MaDate d1 = new MaDate(11, 12, 2004);
        MaDate d2 = new MaDate(10, 7, 2007);
        MaDate d3 = new MaDate(2022);
		
        d3.setJour(5);
        d3.setMois(6);
		
        System.out.println("Date 1 : " + d1);
        System.out.println("Date 2 : " + d2);
        System.out.println("Date 3 : " + d3);
        
        if (d1.getJour() == d2.getJour() && d1.getMois() == d2.getMois() && d1.getAnnee() == d2.getAnnee()) {
            System.out.println("Les dates d1 et d2 sont identiques");
        } else {
            System.out.println("Les dates d1 et d2 sont différentes");
        }
        
        
        boolean x = true;
        while (x) {
            System.out.println("Choisissez une opération : ");
            System.out.println("1. Ajouter un jour");
            System.out.println("2. Ajouter plusieurs jours");
            System.out.println("3. Ajouter un mois");
            System.out.println("4. Ajouter une année");
            System.out.println("5. Quitter");
            
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    d1.ajouterUnJour();
                    System.out.println("Nouvelle Date 1 : " + d1);
                    break;
                case 2:
                    System.out.println("Entrez le nombre de jours à ajouter : ");
                    int jours = scanner.nextInt();
                    d1.ajouterPlusieursJours(jours);
                    System.out.println("Nouvelle Date 1 : " + d1);
                    break;
                case 3:
                    d1.ajouterUnMois();
                    System.out.println("Nouvelle Date 1 : " + d1);
                    break;
                case 4:
                    d1.ajouterUnAn();
                    System.out.println("Nouvelle Date 1 : " + d1);
                    break;
                case 5:
                    x = false;
                    break;
                default:
                    System.out.println("erreur ressayez svp !");
            }
        }
            
        scanner.close();   

	}

}
