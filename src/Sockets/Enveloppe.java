package Sockets;

import java.io.Serializable;

public class Enveloppe implements Serializable {

	private double a;
	private double b;
	private double resultat;
	private char operande;
	
	public Enveloppe(double a, double b , char operande) {
		this.a = a;
		this.b = b;
		this.operande = operande;
		this.resultat = 0;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getResultat() {
		return resultat;
	}

	public void setResultat(double resultat) {
		this.resultat = resultat;
	}

	public char getOperande() {
		return operande;
	}

	public void setOperande(char operande) {
		this.operande = operande;
	}

	@Override
	public String toString() {
		return "Enveloppe [a=" + a + ", b=" + b + ", resultat=" + resultat + ", operande=" + operande + "]";
	}

}
