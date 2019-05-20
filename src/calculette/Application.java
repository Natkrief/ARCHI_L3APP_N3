package calculette;

import java.io.IOException;
import java.util.Properties;

public class Application {

	public static void main(String[] args) {
		Config cfg = new Config();
		cfg.initialisation();
		LigneDeCommande lgn = new LigneDeCommande();
		lgn.demarrer();
	}

}