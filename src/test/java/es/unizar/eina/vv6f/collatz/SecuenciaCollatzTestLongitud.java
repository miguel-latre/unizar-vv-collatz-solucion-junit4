package es.unizar.eina.vv6f.collatz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SecuenciaCollatzTestLongitud {

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(
				new Object[] { 13, 10 },
				new Object[] { 40, 9 },
				new Object[] { 20, 8 },
				new Object[] { 10, 7 },
				new Object[] { 5, 6 },
				new Object[] { 16, 5 },
				new Object[] { 8, 4 },
				new Object[] { 4, 3 },
				new Object[] { 2, 2 },
				new Object[] { 1, 1 });
	}

	private final long n;
	private final int longitud;
	
	public SecuenciaCollatzTestLongitud(long n, int longitud) {
		this.n = n;
		this.longitud = longitud;
	}
	
	@Test
	public void testLongitudCollatz() {
		assertEquals(longitud, new SecuenciaCollatz(n).longitud());
	}

}
