package es.unizar.eina.vv6f.collatz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SecuenciaCollatzTestSiguienteNoParametrizado1 {

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
}
