package caluculette;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LigneDeCommande implements IHM {
	Scanner sc = new Scanner(System.in);
	private char op;

	public LigneDeCommande() {
	}

	@Override
	public void demarer() {

		try {
			System.out.println("Choisissez une première valeur");
			double res = sc.nextDouble();

			System.out.println("Choisissez une deuxième valeur");
			double res2 = sc.nextDouble();

			char choix = afficheMenu();
			double resultat = Calculator.calculer(res, res2, choix);
			System.out.println(res + " " + choix + " " + res2 + " = " + resultat);
		} catch (MonException e ) {
			System.out.println(e.getMessage());
			
		} 
		
		

	}

	public char afficheMenu() {
		System.out.println("Taper '+' pour additionner\nTapez '/' pour Diviser\nTapez 'q' pour Quitter");
		String choix = sc.next();
		char res = (char) choix.charAt(0);
		return res;
	}

}
