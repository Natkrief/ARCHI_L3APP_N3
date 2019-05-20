package calculette;

public class Division implements Operation{

	@Override
	public double calculer(double a, double b) throws MonException{	
		if(b!=0)
			return a/b;
		else
			throw new MonException(EnumException.UTILISATION_ZERO.getCode(),EnumException.UTILISATION_ZERO.getMessage());
	}
}
