package calculette;

public class Addition implements Operation {

	@Override
	public double calculer(double a, double b) throws MonException {
		try {
			if (Double.valueOf(a + "") instanceof Double && Double.valueOf(b + "") instanceof Double) {
				return a + b;
			} else
				throw new MonException(EnumException.VALEUR_INVALIDE.getCode(),
						EnumException.VALEUR_INVALIDE.getMessage());
		} catch (NumberFormatException e) {
			throw new MonException(EnumException.VALEUR_INVALIDE.getCode(), EnumException.VALEUR_INVALIDE.getMessage());
		}
	}

}
