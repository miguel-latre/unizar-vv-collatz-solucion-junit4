package es.unizar.eina.vv6f.collatz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 *  Clase para hacer «pruebas de sistema» de la aplicación.
 */
public class MainTest {

    /**
     * La solución al problema no forma parte del enunciado y, por tanto, de la «test basis».
     * Sin embargo, se ha validado resolviendo el problema 14 de Project Euler,
     * introduciéndola en https://projecteuler.net/problem=14
     */
    private static final int SOLUTION = 837_799;
    private PrintStream oldOut;
    private ByteArrayOutputStream fakeOut;
    private Scanner fakeOutScanner;

    @Before
    public void setUp() {
        oldOut = System.out;
        fakeOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeOut));
    }

    @Test
    public void main() {
        Main.main(null);
        fakeOutScanner = new Scanner(fakeOut.toString());
        assertEquals(SOLUTION, fakeOutScanner.nextInt());
    }

    @After
    public void tearDown() throws IOException {
        System.setOut(oldOut);
        fakeOut.close();
        fakeOutScanner.close();
    }
}