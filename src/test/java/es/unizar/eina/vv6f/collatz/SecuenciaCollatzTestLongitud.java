package es.unizar.eina.vv6f.collatz;

import static es.unizar.eina.vv6f.collatz.SecuenciaCollatzTest.SECUENCIA_EJEMPLO;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SecuenciaCollatzTestLongitud {

	@Parameters
	public static Iterable<Object[]> data() {
		List<Object[]> datos = new ArrayList<>();
		for (int i = 0; i < SECUENCIA_EJEMPLO.length; i++) {
			// Se añaden a la lista de datos para los test pares (n, longitud), siguiendo
			// la secuencia de ejemplo del enunciado
			datos.add(new Object[] { SECUENCIA_EJEMPLO[i], SECUENCIA_EJEMPLO.length - i});
		}
		return datos;
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
