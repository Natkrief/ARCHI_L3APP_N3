package calculette;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Operation {
	public double calculer(double a, double b) throws MonException;
}
