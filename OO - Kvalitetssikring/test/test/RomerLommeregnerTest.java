package test;

import static org.junit.Assert.*;
import main.RomerLommeregner;

import org.junit.Test;

public class RomerLommeregnerTest {
	
	// MMMM D CCCC L XXXX V IIII 
	
	//Almindelige plus-stykker
	@Test
	public void testIEqualsI() {
		assertEquals("I", new RomerLommeregner("I", "").add());
	}
	 
	@Test
	public void testIPlusIEqualsI() {
		assertEquals("II", new RomerLommeregner("I", "I").add());
	}
	
	@Test
	public void testIPlusVEqualsVI() {
		assertEquals("VI", new RomerLommeregner("I", "V").add());
	}
	
	//Simpel oprunding
	@Test
	public void testIIIPlusIIEqualsV() {
		assertEquals("V", new RomerLommeregner("III", "II").add());
	}
	/*
	@Test
	public void testVPlusVEqualsX() {
		assertEquals("X", new RomerLommeregner("V", "V").add());
	}
	
	@Test
	public void testXXXPlusXXEqualsL() {
		assertEquals("L", new RomerLommeregner().add("XXX", "XX"));
	}
	
	@Test
	public void testLPlusLEqualsC() {
		assertEquals("C", new RomerLommeregner().add("L", "L"));
	}
	
	@Test
	public void testCCCPlusCCEqualsD() {
		assertEquals("D", new RomerLommeregner().add("CCC", "CC"));
	}
	
	@Test
	public void testDPlusDEqualsM() {
		assertEquals("M", new RomerLommeregner().add("D", "D"));
	}

	//Oprund + nedskriv
	@Test
	public void testIIIPlusIIIEqualsVI() {
		assertEquals("VI", new RomerLommeregner().add("III", "III"));
	}*/
}
