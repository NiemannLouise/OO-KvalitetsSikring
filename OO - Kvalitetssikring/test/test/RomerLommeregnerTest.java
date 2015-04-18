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
	
	/*
	//Simpel oprunding
	@Test
	public void testIIIPlusIIEqualsV() {
		assertEquals("V", new RomerLommeregner("III", "II").add());
	}
	
	@Test
	public void testVPlusVEqualsX() {
		assertEquals("X", new RomerLommeregner("V", "V").add());
	}
	
	@Test
	public void testXXXPlusXXEqualsL() {
		assertEquals("L", new RomerLommeregner("XXX", "XX").add());
	}
	
	@Test
	public void testLPlusLEqualsC() {
		assertEquals("C", new RomerLommeregner("L", "L").add());
	}
	
	@Test
	public void testCCCPlusCCEqualsD() {
		assertEquals("D", new RomerLommeregner("CCC", "CC").add());
	}
	
	@Test
	public void testDPlusDEqualsM() {
		assertEquals("M", new RomerLommeregner("D", "D").add());
	}

	//Oprund + nedskriv
	@Test
	public void testIIIPlusIIIEqualsVI() {
		assertEquals("VI", new RomerLommeregner("III", "III").add());
	}
	
	@Test
	public void testVPlusVIEqualsXI() {
		assertEquals("XI", new RomerLommeregner("V", "VI").add());
	}
	
	@Test
	public void testXXXPlusXXIEqualsXXVI() {
		assertEquals("LVI", new RomerLommeregner("XXX", "XXVI").add());
	}
	
	@Test
	public void testLPlusLLXIEqualsCLXI() {
		assertEquals("CLXI", new RomerLommeregner("L", "LLXI").add());
	}
	
	@Test
	public void testCCCCPlusCCLXIEqualsDCLXI() {
		assertEquals("DCLXI", new RomerLommeregner("CCCC", "CCLXI").add());
	}
	
	@Test
	public void testMMMPlusDDVIqualsMMDDVI() {
		assertEquals("MMMMVI", new RomerLommeregner("MDDDD", "DDVI").add());
	}

	//Omrokering i rækkefølge
	@Test
	public void testIPlusVEqualsVI() {
		assertEquals("VI", new RomerLommeregner("I", "V").add());
	}
	
	@Test
	public void testVPlusXEqualsXV() {
		assertEquals("XV", new RomerLommeregner("V", "X").add());
	} */
	
}
