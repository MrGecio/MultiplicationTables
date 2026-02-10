/**
 * 
 */
package edu.itq.dto;

/**
 * Peticion para genercuiin de una tabla de multiplicacion
 */
public class Request {
	
	private double numero;
/*
 * 
 * nuemro del cual se quiere generar la tabla de multiplicacion
 * 
 */

	/**
	 * @return the numero
	 */
	public double getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(double numero) {
		this.numero = numero;
	}
}
