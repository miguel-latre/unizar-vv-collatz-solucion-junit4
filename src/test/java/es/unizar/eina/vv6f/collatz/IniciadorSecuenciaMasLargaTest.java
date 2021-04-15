package es.unizar.eina.vv6f.collatz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IniciadorSecuenciaMasLargaTest {
	private final int limite;
	private final long inicio;

	@Parameterized.Parameters
	public static Iterable<Object[]> data() {
		// Pares (límite, generador de la secuenca más larga por debajo del límite) obtenidos
		// calculando los generadores más largos por debajo de cada número del 1 al 10.
		return Arrays.asList(
				new Object[]{ 2, 1},
				new Object[]{ 3, 2},
				new Object[]{ 4, 3},
				new Object[]{ 5, 3},
				new Object[]{ 6, 3},
				new Object[]{ 7, 6},
				new Object[]{ 8, 7},
				new Object[]{ 9, 7},
				new Object[]{10, 9},
				new Object[]{11, 9}
		);
	}

	public IniciadorSecuenciaMasLargaTest(int limite, long iniciador) {
		this.limite = limite;
		this.inicio = iniciador;
	}

	@Test
	public void testInicioSecuenciaMasLarga() {
		assertEquals(inicio, Main.iniciadorSecuenciaMasLarga(limite));
	}
}
