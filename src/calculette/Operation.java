package caluculette;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Operation {
	/*
	private double a;
	private double b;

	
	public Operation(double a,double b) {
		this.a = a;
		this.b = b;
	}


	public double getA() {
		return a;
	}


	public double getB() {
		return b;
	}
*/
	public double calculer(double a,double b) throws MonException;
}
