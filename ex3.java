package ex3;

public class ex3 {

	public static void main(String[] args) {
		Livre[] tab = new Livre [3];
		tab[0] =new Livre ("L'alchimiste",255,"Coelho",0);
		tab[1] =new Livre ("La Tunisie",508,"",0);
		tab[2] =new Livre ("Harry Potter",00,"JK Rowling",65);
		System.out.println("le contenu de tableau est :");
		for (int i = 0 ; i < 3 ; i ++) {
			tab[i].decrire();
		}
		tab[1].setAuteur("Paulo coelho");
		tab[2].setNbPages(461);
		System.out.println("\nAprès modifications :");
		for (int i = 0 ; i < 3 ; i ++) {
			tab[i].decrire();
		}
		tab[0].setPrix(65);
		tab[1].setPrix(100);
		tab[2].setPrix(50);

	}

}
