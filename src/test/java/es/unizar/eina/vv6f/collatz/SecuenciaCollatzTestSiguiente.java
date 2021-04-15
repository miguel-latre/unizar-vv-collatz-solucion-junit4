package es.unizar.eina.vv6f.collatz;

import static es.unizar.eina.vv6f.collatz.SecuenciaCollatzTest.SECUENCIA_EJEMPLO;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SecuenciaCollatzTestSiguiente {

    @Parameters
    public static Iterable<Object[]> data() {
        List<Object[]> datos = new ArrayList<>();
        // Se añaden a la lista de datos para los test pares (n, siguienteCollatz), siguiendo
        // la secuencia de ejemplo del enunciado
        for (int i = 0; i < SECUENCIA_EJEMPLO.length - 1; i++) {
            datos.add(new Object[] { SECUENCIA_EJEMPLO[i], SECUENCIA_EJEMPLO[i + 1]});
        }
        return datos;
    }

    private final long n;
    private final long siguiente;

    public SecuenciaCollatzTestSiguiente(long n, long siguiente) {
        this.n = n;
        this.siguiente = siguiente;
    }

    @Test
    public void testSiguiente() {
        assertEquals(siguiente, SecuenciaCollatz.siguienteCollatz(n));
    }
}
