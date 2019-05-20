package calculette;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class LigneDeCommande implements IHM {
	Scanner sc = new Scanner(System.in);
	private char op;
	ApplicationProperties prop;
	//InputStream input = null;

	@Override
	public void demarer() {
		
		String lang = "FR";
		if(lang.equals("FR"))
			prop = ApplicationProperties.getInstance("C:\\Users\\natkr\\eclipse-workspace\\ARCHI_L3APP_N3\\src\\calculette\\message_fr.properties");
		else
			prop = ApplicationProperties.getInstance("C:\\\\Users\\\\natkr\\\\eclipse-workspace\\\\ARCHI_L3APP_N3\\\\src\\\\calculette\\\\message_en.properties");
		
		System.out.println(prop.lirePropriete("Text1"));
		
		
		try {
			double res = valeur(prop.lirePropriete("Val1"));
			double res2 = valeur(prop.lirePropriete("Val2"));
			char choix = afficheMenu();
			double resultat = Calculette.calculer(res, res2, choix);
			System.out.println(res + " " + choix + " " + res2 + " = " + resultat);
		}

		catch (MonException e) {
			System.out.println(e.getMessage());

		}

	}

	public char afficheMenu() throws MonException{
		char res;
		try {
			System.out.println("Taper '+' pour additionner\nTapez '/' pour Diviser");
			String choix = sc.next();
			res = (char) choix.charAt(0);
			return res;
		} catch(Exception e) {
			throw new MonException(EnumException.CHAR_INVALIDE.getCode(),EnumException.CHAR_INVALIDE.getMessage());
		}

	}

	public double valeur(String cle) throws MonException {
		double res = 0;
		try {
			System.out.println("Choisissez une valeur");
			res = sc.nextDouble();
			return res;
		} catch (InputMismatchException e) {
			throw new MonException(EnumException.VALEUR_INVALIDE.getCode(),EnumException.VALEUR_INVALIDE.getMessage());
		}
	}

}
