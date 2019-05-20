package calculette;

import java.util.logging.Level;
import java.util.logging.Logger;

import Sockets.Requete;

public class Division implements Operation {
	private static final Logger LOGGER = Logger.getLogger(Requete.class.getName());

	@Override
	public double calculer(double a, double b) throws MonException {
		if (b != 0)
			return a / b;
		else {
			LOGGER.log(Level.INFO, "L'utilisateur a tenté une division par 0");
			throw new MonException(EnumException.UTILISATION_ZERO.getCode(),
					EnumException.UTILISATION_ZERO.getMessage());
		}
	}
}
