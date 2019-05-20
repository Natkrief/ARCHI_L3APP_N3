package Sockets;

import java.io.IOException;
import java.util.Scanner;

public class Client implements IHM {

	@Override
	public void demarrer() throws IOException {
		String message;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("tapez un message");
			String mess = sc.next();

			message = Requete.envoie(mess);
			System.out.println("Résultat : " + message);
		}

	}

}
