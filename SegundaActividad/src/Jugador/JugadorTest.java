package Jugador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class JugadorTest {

	    @Test
	    public void testPonerDorsal() {
	        Jugador j = new Jugador();
	        j.ponerDorsal(15);
	        assertEquals(15, j.getDorsal());

	        j.ponerDorsal(0);
	        assertEquals(-1, j.getDorsal());
	    }

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

}
