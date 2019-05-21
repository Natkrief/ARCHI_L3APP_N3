package Sockets;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import calculette.ApplicationProperties;
import calculette.EnumException;
import calculette.MonException;
import calculette.Operation;

public class Client implements IHM {
	private static final Logger LOGGER = Logger.getLogger(Requete.class.getName());
	Scanner sc = new Scanner(System.in);
	ApplicationProperties prop;

	@Override
	public void demarrer() throws IOException, ClassNotFoundException, MonException {
		Enveloppe env;
		String lang = "FR";
		if (lang.equals("FR"))
			prop = ApplicationProperties.getInstance(
					"C:\\Users\\natkr\\eclipse-workspace\\ARCHI_L3APP_N3\\src\\calculette\\message_fr.properties");
		else
			prop = ApplicationProperties.getInstance(
					"C:\\Users\\natkr\\eclipse-workspace\\ARCHI_L3APP_N3\\src\\calculette\\message_en.properties");

		while (true) {
			try {
				System.out.println(prop.lirePropriete("Val1"));
				double val1 = sc.nextDouble();

				System.out.println(prop.lirePropriete("Val2"));
				double val2 = sc.nextDouble();

				System.out.println(prop.lirePropriete("Menu"));
				char choix = sc.next().charAt(0);
				if (choix != '+' && choix != '/') {
					LOGGER.log(Level.INFO, "L'utilisateur n'a pas entré un bon charactère");
					throw new MonException(EnumException.CHAR_INVALIDE.getCode(),
							EnumException.CHAR_INVALIDE.getMessage());
				}
			
			env = Requete.envoie(new Enveloppe(val1, val2, choix));
			System.out.println("Résultat : " + env.getResultat());
			} catch (MonException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				LOGGER.log(Level.INFO,
						"L'utilisateur n'a pas entré une bonne valeur\nException : InputMismatchException");
				throw new MonException(EnumException.VALEUR_INVALIDE.getCode(),
						EnumException.VALEUR_INVALIDE.getMessage());
			}

		}

	}

}
