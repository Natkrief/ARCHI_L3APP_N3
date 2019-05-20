package calculette;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import Sockets.Requete;

public class LigneDeCommande implements IHM {
	Scanner sc = new Scanner(System.in);
	ApplicationProperties prop;
	private static final Logger LOGGER = Logger.getLogger(Requete.class.getName());

	@Override
	public void demarrer() {

		String lang = "FR";
		if (lang.equals("FR"))
			prop = ApplicationProperties.getInstance(
					"C:\\Users\\natkr\\eclipse-workspace\\ARCHI_L3APP_N3\\src\\calculette\\message_fr.properties");
		else
			prop = ApplicationProperties.getInstance(
					"C:\\Users\\natkr\\eclipse-workspace\\ARCHI_L3APP_N3\\src\\calculette\\message_en.properties");

		try {
			double res = valeur(prop.lirePropriete("Val1"));
			double res2 = valeur(prop.lirePropriete("Val2"));
			char choix = afficheMenu(prop.lirePropriete("Menu"));
			double resultat = Calculette.calculer(res, res2, choix);
			System.out.println(res + " " + choix + " " + res2 + " = " + resultat);
		}

		catch (MonException e) {
			System.out.println(e.getMessage());
		}

	}

	public char afficheMenu(String cle) throws MonException {
		System.out.println(cle);
		char choix = sc.next().charAt(0);
		if (choix == '+' || choix == '/')
			return choix;
		else {
			LOGGER.log(Level.INFO, "L'utilisateur n'a pas entré un bon charactère");
			throw new MonException(EnumException.CHAR_INVALIDE.getCode(), EnumException.CHAR_INVALIDE.getMessage());
		}

	}

	public double valeur(String cle) throws MonException {
		double res = 0;
		try {
			System.out.println(cle);
			res = sc.nextDouble();
			return res;
		} catch (InputMismatchException e) {
			LOGGER.log(Level.INFO, "L'utilisateur n'a pas entré une bonne valeur\nException : InputMismatchException");
			throw new MonException(EnumException.VALEUR_INVALIDE.getCode(), EnumException.VALEUR_INVALIDE.getMessage());
		}
	}

}
