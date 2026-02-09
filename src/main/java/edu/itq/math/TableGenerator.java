package edu.itq.math;

/**Los Paquetes como aca arriba el 
 * edu.itq.math
 * seran el dominio de la empresa invertido ejm:
 * 
 * www.itq.edu.mx
 * podriamos:
 * 
 * mx.edu.itq
 * 
 * Clases para generar tablas de multiplicaicon
 * 
 */

public class TableGenerator {

	//Las clases que haremos seran plantillas
	//Las agruparemos segun su logica
	
	//el cliente quiere un codigo para generarle las tablas
	//De multiplicaion 
	
	//Recibimos un parametro y regresamos un  parametro
	
	//Aqui regresarom y recibiremos un arreglo para tener la tabla completa
	

	//Lo que pasara es que recibiremos parametros y regresaremos 
	// n tablas 
	
	//Para mandar podemos hacer:
	//Se puede hacer por arreglo, array list, variant 
	//Para el retorno:
	//
	
	/**
	
	2, 8
	arreglo, arrayList, String, variant 
	
	Respuesta
	
	2x1=2
	...
	2x10=20
	
	8x1=8
	...
	8x10=80
	
	*/
	
	//Objetivo usar POO
	
	/**
	 * Genera la tabla de multiplicacion de un numero dado
	 * @param numero de la tabla de multiplicaion 
	 * @return restructura de a tabla de multiplicaion 
	 */
	
	//***********************************
	//Estructura de JAVA
	/*
	 * Tenemos un contenedor del proyecto la carpeta raiz MultiplicatonTables 
	 * 1-PAQUETES 
	 * sirven para evitar colisones de nombres 
	 * y para estructurar logimanecete separando responsabilidades 
	 * 
	 * 2-CLASES
	 * (PLANO o MOLDE)
	 * EN java creamos moldes y llammamos clases
	 * cada clase tendra una responsabilidad
	 * 
	 * TableGenerator:
	 * salcula tablas 
	 * 
	 * Principal:
	 * arranca el programa y muestra datos
	 * 
	 * 3-METODOS Y ATRIBUTOS 
	 * son las acciones que el objeto puede realizar
	 * 
	 * 
	 * 4-OBJETOS
	 * Estos los generamos en la clase principal 
	 * y se modificaran a lo largo de los metods de las clases 
	 * 
	 */
	
	//**********************************
	//Acalracion en Java 
	/*
	 * 
	 * Todo el codigo debe vivir en una clase no existen funciones en java 
	 * SOLO EXISTEN METODOS
	 * un metodo en java es una funcion que 
	 * pertenece a una clase 
	 * 
	 * 
	 * Declarar Metodos en JAVA:
	 * 
	 * 	Se declaran en una esctructura jerarquica
	 * 	1- Modificador de accesso public private
	 * 		public
	 * 		Accesso Totalcualquier otra clase puedo usarlo
	 * 
	 * 		private	
	 * 		solo la propia clase puedo usarlo
	 * 		se usa para proteger datos variables y ,metodos auxiliares que no quiero que se modifiquen por eeror 
	 * 
	 * 
	 * 	2- Tipo de Reorno Que entrega al terminar String[], int, void
	 * 	3- Nombre del metodo metodoEpico
	 * 	4-Parametros datos qie recibe el parentesis (int, float, string)
	 * 	5- cuerpo {}
	 * 
	 * ejm:
	 * 
	 * 	public int metodoEpico(int numero){
	 * 	}
	 * 
	 */
	
	public String[] generarTabla(int numero) {
		//
		String[] tablaGenerada = new String[10];
		
		
		for(int i = 1; i<=10; i++) {
			tablaGenerada[i-1]=i+" x "+numero+" = "+(i * numero);
		}
		
		return tablaGenerada;
		
	}
	
	//Generar n Tablas
	public String[][] generarTablas(int numero) {
		String[][]tablasGeneradas = null;
		return tablasGeneradas;
	}
	
	
	
}






