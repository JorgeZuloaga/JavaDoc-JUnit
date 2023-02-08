package Soldado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class SoldadoTest {
    @Test
    public void testPuedeDisparar() {
        Soldado s = new Soldado();
        s.setNumeroBalas(1);
        assertTrue(s.puedeDisparar());

        s.setNumeroBalas(0);
        assertFalse(s.puedeDisparar());
    }

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
