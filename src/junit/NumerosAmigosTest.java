package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumerosAmigosTest {

	@Test
	void testAmigoMal() {
		NumerosAmigos n1= new NumerosAmigos(221, 222);
		boolean valor=n1.amigo();
		assertFalse(valor);
	}
	@Test
	void testAmigoPerfecto() {
		NumerosAmigos n1= new NumerosAmigos(220, 284);
		boolean valor=n1.amigo();
		assertTrue(valor);
	}

	@Test
	void testEsCeroN1() {
		NumerosAmigos n1= new NumerosAmigos(0, 16);
		Integer valor= n1.esN1IgualAN2();
		assertNull(valor);
	}
	@Test
	void testN1yN2SonIguales() {
		Integer valorEsperado=1;
		NumerosAmigos n1= new NumerosAmigos(16, 16);
		Integer valor= n1.esN1IgualAN2();
		assertEquals(valorEsperado,valor);
	}
	@Test
	void testN1yN2NoSonIguales() {
		Integer valorEsperado=0;
		NumerosAmigos n1= new NumerosAmigos(55, 16);
		Integer valor= n1.esN1IgualAN2();
		assertEquals(valorEsperado,valor);
	}

}
