package fr.codevallee;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatriceTest {
	
	static Calculatrice calculatrice;
	
	@Test
	public void premierTest() throws Exception {
		assertEquals(1, 1);
	}
	
	@Test
	public void additionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.addition(a, b);
		assertEquals(retour, 4.0, 0.0);
	}
	
	
	@Test
	public void soustractionTest() throws Exception {
		double a = 5;
		double b = 3;
		double retour = calculatrice.soustraction(a, b);
		assertEquals(retour, 2.0, 0.0);
	}
	
	@Test
	public void multiplicationTest() throws Exception {
		double a = 4;
		double b = 3;
		double retour = calculatrice.multiplication(a, b);
		assertEquals(retour, 12.0, 0.0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisionTest() throws Exception {
		double a = 12;
		double b = 0;
		double retour = calculatrice.division(a, b);
		assertEquals(retour,0.0, 0.0);
	}
	
	@BeforeClass
	public static void initialition() {
		calculatrice = new CalculatriceImpl();
	}


}
