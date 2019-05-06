package caluculette;

import java.util.Scanner;

public class Operation {
	int op;
	private double a;
	private double b;
	
	public Operation(int op,double a,double b) {
		this.op=op;
		this.a = a;
		this.b = b;
	}
	
	double res;
	public double calculer(int op,double a,double b) {
		switch(op) {
		case 1 : 
			Addition ad = new Addition(op,a,b);
			res = ad.calculer(a,b);
			break;
			
		case 2 :
			Division dv = new Division(op,a,b);
			res = dv.calculer(a, b);
			break;
			
		case 3 :
			System.out.println("Bonne soirée à vous !");
			break;
		
		default : System.out.println("VOUS NE PASSEREZ PAAAS");
		
		
		}
		return res;
	}
	
	public void afficheResultat() {

		System.out.println(res);

		
		
	}
	
}
