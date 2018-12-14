package org.example.modular;

import static org.testng.Assert.assertEquals;

import org.example.modular.Modular;
import org.testng.annotations.Test;

public class ModularTest {
	@Test
	public void testModular() throws Exception {
		Modular m = new Modular();
		assertEquals(m.getDummyString(), "dummyString");
	}
}
