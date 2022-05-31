package test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Calculatrice.Addition;
import Calculatrice.Division;
import Calculatrice.Multiplication;
import Calculatrice.Soustraction;
import exception.CalculatriceException;

public class CalculatriceTest {

	
	@Test
	public void testAddition() {
		Addition add = new Addition();
		try {
			assertEquals(add.calculer(1,3) , 4);
			assertEquals(add.calculer(1,-3) , -2);
			assertEquals(add.calculer(1,-1) , 0);
			assertEquals(add.calculer(3,3) , 6);
			assertEquals(add.calculer(1,0) , 1);
			assertEquals(add.calculer(0,1) , 1);
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testMultiplication() {
		Multiplication mul = new Multiplication();
		try {
			assertEquals(mul.calculer(1,3) , 3);
			assertEquals(mul.calculer(1,-3) , -3);
			assertEquals(mul.calculer(1,-1) , -1);
			assertEquals(mul.calculer(3,3) , 9);
			assertEquals(mul.calculer(1,0) , 0);
			assertEquals(mul.calculer(0,1) , 0);
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testSoustraction() {
		Soustraction sous = new Soustraction();
		try {
			assertEquals(sous.calculer(1,3) , -2);
			assertEquals(sous.calculer(1,-3) , 4);
			assertEquals(sous.calculer(1,-1) , 2);
			assertEquals(sous.calculer(3,3) , 0);
			assertEquals(sous.calculer(1,0) , 1);
			assertEquals(sous.calculer(0,1) , -1);
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testDivision() {
		Division div = new Division();
		try {
			assertEquals(div.calculer(1,-2) , -0.5);
			assertEquals(div.calculer(1,-1) , -1);
			assertEquals(div.calculer(3,3) , 1);
			assertEquals(div.calculer(1,4) , 0.25);
			assertEquals(div.calculer(0,1) , 0);
			assertEquals(div.calculer(1,0) , 0);
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
