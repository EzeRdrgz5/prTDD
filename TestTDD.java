package prTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTDD {

	@Test
	public void testSize1() {
		String[] claves={};
		String[] valores={};
		prTDD a= new prTDD(claves,valores);
		assertTrue(a.size()==claves.length);
	}
	@Test
	public void testSize2() {
		String[] claves={"hola"};
		String[] valores={"adios"};
		prTDD a= new prTDD(claves,valores);
		assertTrue(a.size()==claves.length);
	}

}
