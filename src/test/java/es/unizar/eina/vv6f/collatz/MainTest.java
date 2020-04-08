package es.unizar.eina.vv6f.collatz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {

    @SuppressWarnings("FieldCanBeLocal")
    private static int SOLUTION = 837_799;
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