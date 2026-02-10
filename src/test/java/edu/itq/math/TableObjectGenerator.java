/**
 * 
 */
package edu.itq.math;

//Importamos los contratos
import edu.itq.dto.Response;
import edu.itq.dto.Request;
import edu.itq.dto.Multiplicacion;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class TableObjectGenerator {
	
	/*
	 * 
	 * Generar una tabla de multiplicacion para un numero dado 
	 * param request contiene el nu8mero de la tabla a generar 
	 * return la tabla de multiplicacion generada
	 */
	
	
	//Regreso una Respponse y el emtodo se llamara generar una tabla y Recibo un Request 
	public Response generarTabla(Request request) {
		
	
		Response response = new Response();
		List<Multiplicacion> tabla = new ArrayList<>();
		/*
		 * 
		 * El Contrato: Al declarar List<Multiplicacion>, le dices a Java: "Aquí voy a tener una lista de objetos, y prometo que tendrá métodos como .add() para meter cosas y .get() para sacarlas".

		Los Diamantes <> (Generics): Sirven para especificar qué tipo de "mercancía" guarda la lista. Al poner <Multiplicacion>, aseguras que nadie pueda meter un String o un int por error en esa lista.
		 * 
		 * 
		 * ArrayList es una Clase que "obedece" el contrato de List. Es la herramienta real que construye la lista en la memoria de tu computadora.

		Dinámico: A diferencia de tu arreglo new String[10] que tiene un tamaño fijo, un ArrayList crece automáticamente conforme le vas agregando elementos con .add().

		Basado en Arreglos: Internamente, Java usa un arreglo, pero cuando se llena, él mismo crea uno más grande y mueve todo el contenido sin que tú tengas que programar nada de eso.
		 * 
		 */
		double numero = request.getNumero();
		for(int i = 1; i<=10;i++) {
			
		Multiplicacion multiplicacion = new Multiplicacion();
		multiplicacion.setOperando1(numero);
		multiplicacion.setOperando2(i);
		multiplicacion.setResultado(numero*i);
		
		//Almacenamiento: tabla.add(multiplicacion); mete ese objeto ya lleno a la lista.
		tabla.add(multiplicacion);

		
		
		}
		//response.setTabla(tabla);: Le entregas la lista completa al objeto de respuesta.
		response.setTabla(tabla);
		return response;
	}

}
