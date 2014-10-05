package edu.eetac.upc.dxat.mgasull.seminari1;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcTest {

	calc c = new calc();
	
	@Test
	public void testSuma() {
		
		assertEquals(8, c.suma(3, 5));
	}
	
	@Test
	public void testResta() {
		assertEquals(-2, c.resta(3, 5));
	}

	@Test
	public void testProduct() {
		assertEquals(15, c.product(3, 5));
	}

	@Test
	public void testDiv() {
		assertEquals(1, c.div(3, 2));
	}
	
	@Test
	public void testIsHihger() {
		assertTrue(c.ishigher(5, 2));
		assertFalse(c.ishigher(2, 5));
		}

}
