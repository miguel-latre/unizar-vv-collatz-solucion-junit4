package es.unizar.eina.vv6f.collatz;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SecuenciaCollatzTestSiguiente {

    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(
                new Object[] { 13, 40 },
                new Object[] { 40, 20 },
                new Object[] { 20, 10 },
                new Object[] { 10, 5 },
                new Object[] { 5, 16 },
                new Object[] { 16, 8 },
                new Object[] { 8, 4 },
                new Object[] { 4, 2 },
                new Object[] { 2, 1 });
    }

    private final long n;
    private final long next;

    public SecuenciaCollatzTestSiguiente(long n, long next) {
        this.n = n;
        this.next = next;
    }

    @Test
    public void testSiguiente() {
        assertEquals(next, SecuenciaCollatz.siguienteCollatz(n));
    }
}
