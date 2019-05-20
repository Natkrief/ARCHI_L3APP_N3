package testUnit;

import static org.junit.Assert.*;

import java.rmi.server.Operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculette.Calculette;
import calculette.Config;
import calculette.Division;
import calculette.EnumException;
import calculette.MonException;

public class TestDivision {

	@Before
	public void setUp() throws Exception {
		Config cfg = new Config();		
		cfg.initialisation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = MonException.class)
	public void testDivisionParZero() throws MonException {
		double a = 15;
		double b = 0;
		assertEquals(a/b, Calculette.calculer(a, b, '/'));
	}

	@Test
	public void testDivisionValide() throws MonException {
		double a = 15;
		double b = 3;
		assertEquals(a / b, Calculette.calculer(a, b, '/'), 0);
	}

}
