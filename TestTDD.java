package prTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTDD {

	@Test
	public void testSize1() {
		String[] claves={"adios"};
		String[] valores={"hola"};
		prTDD a= new prTDD(claves,valores);
		assertTrue(a.size()==claves.length);
	}

}
