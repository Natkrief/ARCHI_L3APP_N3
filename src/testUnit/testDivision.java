package testUnit;

import static org.junit.Assert.*;

import java.rmi.server.Operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import caluculette.Calculator;
import caluculette.Division;
import caluculette.EnumException;
import caluculette.MonException;

public class testDivision {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=MonException.class)
	public void testDivisionParZero() throws MonException {
		double a = 15;
		double b = 0;
		Division div = new Division();
		assertEquals(div.calculer(a, b),Calculator.calculer(a, b, '/'));
	}
	
	@Test
	public void testDivisionValide() throws MonException {
		double a = 15;
		double b = 3;
		Division div = new Division();
		assertEquals(5.0,div.calculer(a, b),0);
	}

}
