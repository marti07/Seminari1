package edu.eetac.upc.dxat.mgasull.seminari1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectTest {

	@Test
	public void test() {
		Object obj = new Object();
		
		obj.index = 1;
		obj.name = "marti";
		
		
		
		assertEquals(obj, obj.Get());
	}
}
