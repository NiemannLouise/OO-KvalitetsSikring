package test;

import static org.junit.Assert.*;
import main.RomerLommeregner;

import org.junit.Test;

public class RomerLommeregnerTest {

	@Test
	public void testTomTekstStreng() {
		assertEquals("", new RomerLommeregner().add("", ""));
	}
	
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
	
	@Test
	public void testIIPlusVEqualsVI() {
		assertEquals("VII", new RomerLommeregner().add("II", "V"));
	}

}
