/**
* La clase SoldadoTest es una clase de prueba unitaria para la clase Soldado.
* @author JORGE
*/
package Jugador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class JugadorTest {
	
	/**
     * Prueba el m�todo ponerDorsal de la clase Jugador. 
     * Comprueba que se asigna correctamente el valor del dorsal al jugador.
     * Comprueba que, si se introduce un valor fuera del rango permitido, se asigna el valor -1 al dorsal.
     */

	    @Test
	    public void testPonerDorsal() {
	        Jugador j = new Jugador();
	        j.ponerDorsal(15);
	        assertEquals(15, j.getDorsal());

	        j.ponerDorsal(0);
	        assertEquals(-1, j.getDorsal());
	    }
	    
	    /**
	     * Prueba el m�todo estaExpulsado de la clase Jugador. 
	     * Comprueba que el m�todo devuelve true si el jugador tiene dos tarjetas amarillas o una tarjeta roja. 
	     * Comprueba que el m�todo devuelve false si el jugador tiene una tarjeta amarilla y ninguna tarjeta roja.
	     */

	    @Test
	    public void testEstaExpulsado() {
	        Jugador j = new Jugador();
	        j.setNumeroTarjetasAmarillas(1);
	        j.setNumeroTarjetasRojas(0);
	        assertFalse(j.estaExpulsado());

	        j.setNumeroTarjetasAmarillas(2);
	        j.setNumeroTarjetasRojas(0);
	        assertTrue(j.estaExpulsado());

	        j.setNumeroTarjetasAmarillas(1);
	        j.setNumeroTarjetasRojas(1);
	        assertTrue(j.estaExpulsado());
	    }
	}

