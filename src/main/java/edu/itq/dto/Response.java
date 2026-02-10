
package edu.itq.dto;
import java.util.List;
/*
 * DTO
 * Data transfer Object
 * 
 * Objeto para tranferir los datos
 * 
 * Esto es parte del contrato
 */

//Respuesta

public class Response {
	
	
	//Tabla de multiplicacion de un numero dado
	private List<Multiplicacion> tabla;

	/**
	 * @return the tabla
	 */
	public List<Multiplicacion> getTabla() {
		return tabla;
	}

	/**
	 * @param tabla the tabla to set
	 */
	public void setTabla(List<Multiplicacion> tabla) {
		this.tabla = tabla;
	}

}
