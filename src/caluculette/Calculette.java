package caluculette;

import java.util.Scanner;

public class Calculette {

	static Scanner sc = new Scanner(System.in);
	public static void calcul() {
		System.out.println("Choisissez un premier chiffre");
		double a = sc.nextDouble();
		
		System.out.println("Choisissez un deuxième chiffre");
		double b = sc.nextDouble();
		
		System.out.println("Taper 1 pour addition"+"\nTapez 2 pour division\nTapez 3 pour quitter");
		int menu = sc.nextInt();
		
		switch(menu) {
		
		case 1: System.out.println(a+b);
			break;
		
		case 2: 
			if(b==0) {
				System.out.println("Divison par 0 impossible");
				break;
				}
			System.out.println(a/b);
			break;
		
		case 3: break;
		
		default : System.out.println("Vous n'avez pas tapé une bonne valeur !");
		
		}
	}
	
	public static void main(String[] args) {
		calcul();
	}
	
}
