package caluculette;

public class Calculator {
	

	public static double calculer(double a,double b,char choix) throws MonException {
		Operation op = Config.getOpe(choix);
		double res = op.calculer(a, b);
		return res;
	}
}
