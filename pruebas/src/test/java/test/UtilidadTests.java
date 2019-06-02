package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilidadTests {

	
	@Test
	public void test_simple() {
		assertEquals( 3, new Utilidad().max(1, 3));
	}
}
