/**
 * 
 */
package edu.itq.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.itq.dto.Request;
import edu.itq.dto.Response;

/**
 * Metodo para probar distintos metodos
 * 
 * Para probar cualquier metodo hacemos obejtos de esos metodos aqui
 * 
 */
class TableGeneratorTest {

	@Test
	void generarTablaTest() {
		
		//Creacion de objeto para la prueba
		//En un test primero llamos a la funcionalidad y luego ...
		TableGenerator tableGenerator = new TableGenerator();
		String[] tabla = tableGenerator.generarTabla(7);
	
		//Verificamos el resultado haciendo una aseveracion
		String expectedResult = "2 x 7 = 14";
				
		//Aqui estamos comprando con la tabla del dos osease a la posicion 1 ya que la 0 es la tabla del 1
		assertEquals(expectedResult, tabla[1]);
		//Podemios hacer los assertys que quiera 
		assertEquals("7 x 7 = 49", tabla[6]);
				
				//Para correlos seleccionamos el test en el codigo click derecho run as j unitest 
				
	}
	
	
	//Otro test
	@Test
	void generarTablasTest() {
		
		TableObjectGenerator tableObjectGenerator = new TableObjectGenerator();
		Request request = new Request();
		request.setNumero(7.0);
		Response response = tableObjectGenerator.generarTabla(request);
		assertEquals(7.0,response.getTabla().get(0).getResultado(),0);
		 assertEquals(56.0, response.getTabla().get(7).getResultado(), 0);
	    System.out.println(response.getTabla());
		
		
				
	}

}
