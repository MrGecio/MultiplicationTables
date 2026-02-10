/**
 * 
 */
package edu.itq.dto;

/**
 * Representa una multiplicacion dodne tengo operando1 x operando2 = resultado
 */
public class Multiplicacion extends Object{
	
	private double operando1;
	
	private double operando2;
	
	private double resultado;

	/**
	 * @return the operando1
	 */
	public double getOperando1() {
		return operando1;
	}

	/**
	 * @param operando1 the operando1 to set
	 */
	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	/**
	 * @return the operando2
	 */
	public double getOperando2() {
		return operando2;
	}

	/**
	 * @param operando2 the operando2 to set
	 */
	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	/**
	 * @return the resultado
	 */
	public double getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	/**
     * Representación String del objeto.
     */
    @Override
    public String toString() {
        return operando1 + " x " + operando2 + " = " + resultado;
    }


}
