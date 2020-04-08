package es.unizar.eina.vv6f.collatz;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
                new Object[] { 1, 4 },
                new Object[] { 2, 1 },
                new Object[] { 3, 10 },
                new Object[] { 4, 2 },
                new Object[] { 5, 16 },
                new Object[] { 6, 3 },
                new Object[] { 7, 22 },
                new Object[] { 8, 4 },
                new Object[] { 9, 28 },
                new Object[] { 10, 5 },
                new Object[] { 11, 34 },
                new Object[] { 12, 6 },
                new Object[] { 13, 40 },
                new Object[] { 14, 7 },
                new Object[] { 15, 46 },
                new Object[] { 16, 8 },
                new Object[] { 17, 52 },
                new Object[] { 18, 9 },
                new Object[] { 19, 58 },
                new Object[] { 20, 10 },
                new Object[] { 21, 64 },
                new Object[] { 22, 11 },
                new Object[] { 23, 70 },
                new Object[] { 24, 12 },
                new Object[] { 25, 76 },
                new Object[] { 26, 13 },
                new Object[] { 27, 82 },
                new Object[] { 28, 14 },
                new Object[] { 29, 88 },
                new Object[] { 30, 15 },
                new Object[] { 31, 94 },
                new Object[] { 32, 16 },
                new Object[] { 33, 100 },
                new Object[] { 34, 17 },
                new Object[] { 35, 106 },
                new Object[] { 36, 18 },
                new Object[] { 37, 112 },
                new Object[] { 38, 19 },
                new Object[] { 39, 118 },
                new Object[] { 40, 20 },
                new Object[] { 41, 124 },
                new Object[] { 42, 21 },
                new Object[] { 43, 130 },
                new Object[] { 44, 22 },
                new Object[] { 45, 136 },
                new Object[] { 46, 23 },
                new Object[] { 47, 142 },
                new Object[] { 48, 24 },
                new Object[] { 49, 148 },
                new Object[] { 50, 25 });
    }

    private long n;
    private long next;

    public SecuenciaCollatzTestSiguiente(long n, long next) {
        this.n = n;
        this.next = next;
    }

    @Test
    public void testSiguiente() {
        assertEquals(next, SecuenciaCollatz.siguienteCollatz(n));
    }
}
