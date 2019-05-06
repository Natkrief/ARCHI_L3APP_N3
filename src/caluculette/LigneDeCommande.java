package caluculette;

import java.util.Scanner;

public class LigneDeCommande implements IHM{
	Scanner sc = new Scanner(System.in);
	private char op;
	
	public LigneDeCommande() {
	}

	@Override
	public void launch() {
		
		System.out.println("Choisissez une première valeur");
		double res = sc.nextDouble();
		
		System.out.println("Choisissez une deuxième valeur");
		double res2 = sc.nextDouble();
		
		int choix;
		
		do {
			choix = afficheMenu();
			Operation op = new Operation(choix,res,res2);
			
			op.afficheResultat();
		}
		while(choix!=3);
		
	}
	
	public int afficheMenu() {
		System.out.println("Taper 1 pour additionner\nTapez 2 pour Diviser\nTapez 3 pour Quitter"); 
		int choix = sc.nextInt();
		return choix;
	}
}
