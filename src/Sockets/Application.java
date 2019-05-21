package Sockets;

import java.io.IOException;

import calculette.Config;
import calculette.MonException;

public class Application {

	public static void main(String[] args) throws IOException, ClassNotFoundException, MonException {
		Config cfg = new Config();
		cfg.initialisation();
		new Thread(new Runnable() {
			public void run() {
				try {
					Service.demarrage();
				} catch (IOException | ClassNotFoundException | MonException e) {
					e.printStackTrace();
				}

			}
		}

		).start();

		// START CLIENT
		IHM client = new Client();
		client.demarrer();

	}
}
