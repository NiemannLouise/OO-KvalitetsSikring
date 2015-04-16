package test;

import static org.junit.Assert.*;
import main.RomerLommeregner;

import org.junit.Test;

public class RomerLommeregnerTest {
	
	// MMMM D CCCC L XXXX V IIII 
	
	//Almindelige plus-stykker
	@Test
	public void testIEqualsI() {
		assertEquals("I", new RomerLommeregner().add("I", ""));
	}
	
	@Test
	public void testIPlusIEqualsI() {
		assertEquals("II", new RomerLommeregner().add("I", "I"));
	}
	
	@Test
	public void testIPlusVEqualsVI() {
		assertEquals("VI", new RomerLommeregner().add("I", "V"));
	}
	
	//Simpel oprunding
	@Test
	public void testIIIPlusIIEqualsV() {
		assertEquals("V", new RomerLommeregner().add("III", "II"));
	}
	
	@Test
	public void testVPlusVEqualsX() {
		assertEquals("X", new RomerLommeregner().add("V", "V"));
	}
	
	@Test
	public void testXXXPlusXXEqualsL() {
		assertEquals("L", new RomerLommeregner().add("XXX", "XX"));
	}
	

}
