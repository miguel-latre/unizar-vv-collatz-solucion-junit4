package es.unizar.eina.vv6f.collatz;

import org.junit.Test;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class SecuenciaCollatzTestNoValidos {

    @Test(expected = IllegalArgumentException.class)
    public void testSiguienteCollatz_0() {
        SecuenciaCollatz.siguienteCollatz(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSiguienteCollatz_negativo() {
        SecuenciaCollatz.siguienteCollatz(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongitudCollatz_0() {
        new SecuenciaCollatz(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongitudCollatz_negativo() {
        new SecuenciaCollatz(-1);
    }

}