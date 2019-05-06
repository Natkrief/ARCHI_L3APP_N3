package caluculette;

public class Division extends Operation{

	public Division(int op, double a, double b) {
		super(op, a, b);
		// TODO Auto-generated constructor stub
	}
	
	public double calculer(double a,double b) {
		double resultat = 0;
		try {
			resultat = division(a,b);
		} catch (ArithmeticException e) {
			System.out.println("Division par 0 impossible");
		}
		
		return resultat;
	}

	
	public static double division(double a,double b) throws ArithmeticException {
		return a / b;
	}
}
