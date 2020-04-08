package es.unizar.eina.vv6f.collatz;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SecuenciaCollatzTestSiguiente.class,
		SecuenciaCollatzTestLongitud.class, SecuenciaCollatzTestNoValidos.class,
		IniciadorSecuenciaMasLargaTest.class, MainTest.class})
public class SecuenciaCollatzTestSuite {
}
