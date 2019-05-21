package calculette;

import Sockets.Enveloppe;

public class Calculette {
	

	public static double calculer(double a,double b,char choix) throws MonException {
		Operation op = Config.getOpe(choix);
		double res = op.calculer(a, b);
		return res;
	}
	
	public static Enveloppe calculeOpe(Enveloppe env) throws MonException {
		Operation op = Config.getOpe(env.getOperande());
		double res = op.calculer(env.getA(), env.getB());
		env.setResultat(res);
		return env;
	}
}
