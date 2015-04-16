package test;

import static org.junit.Assert.*;
import main.RomerLommeregner;

import org.junit.Test;

public class RomerLommeregnerTest {

	@Test
	public void testTomTekstStreng() {
		assertEquals("", new RomerLommeregner().add(""));
	}
	
	@Test
	public void testIEqualsI() {
		assertEquals("I", new RomerLommeregner().add("I"));
	}

}
