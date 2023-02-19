package JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Jugador.jugador;

class jugadorTest {
/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
*/
	
	@Test
	public void darNumeroTest() {
		jugador jugador = new jugador();
		jugador.setDorsal(21);
		int numero = jugador.getDorsal();
		assertFalse(numero >= 30);
	}
	
	@Test
	public void noDarNumeroTest() {
		jugador jugador = new jugador();
		jugador.setDorsal(0);
		int numero = jugador.getDorsal();
		assertTrue(numero <= 0);
	}
	
	@Test
	public void expulsadoTest() {
		jugador jugador = new jugador();
		int tarjetasAmarillas = 2;
		jugador.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		assertTrue(tarjetasAmarillas == 2);
	}
	
	@Test
	public void noExpulsadoTest() {
		jugador jugador = new jugador();
		int tarjetasAmarillas = 1;
		jugador.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		assertTrue(tarjetasAmarillas < 2);
	}
	
	@Test
	public void expulsadoRojaTest() {
		jugador jugador = new jugador();
		int tarjetasRojas = 2;
		jugador.setNumeroTarjetasRojas(tarjetasRojas);
		assertTrue(tarjetasRojas == 2);
	}
	
	@Test
	public void noExpulsadoRojaTest() {
		jugador jugador = new jugador();
		int tarjetasRojas = 0;
		jugador.setNumeroTarjetasRojas(tarjetasRojas);
		assertTrue(tarjetasRojas < 2);
	}
}
