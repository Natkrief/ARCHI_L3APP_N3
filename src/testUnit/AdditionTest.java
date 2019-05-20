package testUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculette.Addition;
import calculette.Calculette;
import calculette.Config;
import calculette.MonException;
import calculette.Operation;

public class AdditionTest {

	@Before
	public void setUp() throws Exception {
		Config cfg = new Config();		
		cfg.initialisation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdditionOk() throws MonException{
		double a = 5;
		double b = 2;
		assertEquals(a + b, Calculette.calculer(a, b,'+'),0);
	}

}
