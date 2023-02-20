/**
La clase SoldadoTest es una clase de prueba unitaria para la clase Soldado.
*/

package Soldado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;



public class SoldadoTest {
	
	/**
	 * Prueba unitaria del m�todo puedeDisparar de la clase Soldado.
	 * Comprueba que un soldado puede disparar si tiene balas y no puede si no tiene balas.
     * @author JORGE
	 */
	
    @Test
    public void testPuedeDisparar() {
        Soldado s = new Soldado();
        s.setNumeroBalas(1);
        assertTrue(s.puedeDisparar());

        s.setNumeroBalas(0);
        assertFalse(s.puedeDisparar());
    }
    
    /**
     * Prueba unitaria del m�todo disparar de la clase Soldado.
     * Comprueba que un soldado puede disparar a otro soldado y este muere si se queda sin balas.
     */

    @Test
    public void testDisparar() {
        Soldado s1 = new Soldado();
        Soldado s2 = new Soldado();
        s1.setNumeroBalas(1);
        s1.disparar(s2);
        assertTrue(s2.isEstaMuerto());
        assertEquals(0, s1.getNumeroBalas());
    }
}
