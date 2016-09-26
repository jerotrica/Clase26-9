package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplejoTest {


	@Test
	public void ProbarSumaComplejos() {
		Complejo primerComplejo = new Complejo(2d,3d);
		Complejo segundoComplejo = new Complejo(4d,3d);
		Complejo resultado;
		resultado =primerComplejo.suma(segundoComplejo);
		Complejo resultadoEsperado = new Complejo(6d,6d);
		assertEquals(resultado,resultadoEsperado);
	}

}
