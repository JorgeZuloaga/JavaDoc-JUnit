package JUnit5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

import Soldado.soldado;


class SoldadoTest {

/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void noPuedeDispararTest() {
		System.out.println("Test no puede disparar.");
		soldado sol = new soldado();
		sol.setNumeroBalas(0);
		int balas = 0;
		assertTrue(balas <= sol.getNumeroBalas());
		
	}
	public void puedeDispararTest() {
		System.out.println("Test puede disparar.");
		soldado sol = new soldado();
		sol.setNumeroBalas(1);
		assertTrue(sol.getNumeroBalas() > 0);
	}
	
	public void dispararTest(soldado sol) {
		soldado sol1 = new soldado();
		sol1.setNumeroBalas(1);
		int balas = sol1.getNumeroBalas();
		if(balas > 0) {
			sol.setEstaMuerto(true);
		}else if((balas < 0) || (balas == 0)){
			sol.setEstaMuerto(false);
		}
	}

}
