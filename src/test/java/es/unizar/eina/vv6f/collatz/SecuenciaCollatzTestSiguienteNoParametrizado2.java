package es.unizar.eina.vv6f.collatz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecuenciaCollatzTestSiguienteNoParametrizado2 {

    @Test(expected = IllegalArgumentException.class)
    public void testSiguiente_noPositivo() {
        SecuenciaCollatz.siguienteCollatz(0);
    }

    @Test
    public void testSiguiente_13() {
        assertEquals(40, SecuenciaCollatz.siguienteCollatz(13));
    }

    @Test
    public void testSiguiente_40() {
        assertEquals(20, SecuenciaCollatz.siguienteCollatz(40));
    }

    @Test
    public void testSiguiente_20() {
        assertEquals(10, SecuenciaCollatz.siguienteCollatz(20));
    }

    @Test
    public void testSiguiente_10() {
        assertEquals(5, SecuenciaCollatz.siguienteCollatz(10));
    }

    @Test
    public void testSiguiente_5() {
        assertEquals(16, SecuenciaCollatz.siguienteCollatz(5));
    }

    @Test
    public void testSiguiente_16() {
        assertEquals(8, SecuenciaCollatz.siguienteCollatz(16));
    }

    @Test
    public void testSiguiente_8() {
        assertEquals(4, SecuenciaCollatz.siguienteCollatz(8));
    }

    @Test
    public void testSiguiente_4() {
        assertEquals(2, SecuenciaCollatz.siguienteCollatz(4));
    }

    @Test
    public void testSiguiente_2() {
        assertEquals(1, SecuenciaCollatz.siguienteCollatz(2));
    }
}
