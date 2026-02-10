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
		
		//Este es un contenedor de tipo STRING
		//de nombre tablaGenerda y contendra 10 Strings reservadoss en memoria 
		String[] tablaGenerada = new String[10];
		
		//Recordando cosas de JAVA 
		
		/*
		 * Tenemso datos simples
		 * 
		 * String variable = "German"
		 * 
		 * Se guarda un solo valor
		 * 
		 * 
		 * 
		 * Arreglos unidimensionales
		 * 
		 * String[] variable =  new String [2]
		 * 
		 * Es una lista o fila de textos
		 * Sirven para colecciones de datos del mismo tipo 
		 * ejem 10 lineas de tablas
		 * 
		 * 
		 * Arreglo bidimensional Matriz
		 * 
		 * String [][] variable = new String [5][7]
		 * 
		 * Tabla con filas y columnas
		 * 
		 * 
		 * 
		 * Se puede hacer con float int , etc.
		 * 
		 * int, int[], int[][]
		 * String[],string
		 * 
		 * 
		 * Este no se puede hacer errelos o matrices
		 * void
		 */
		
		//************************************
		
		//ahora declaramos un ciclo
		
		for(int i = 1; i<=10; i++) {
			tablaGenerada[i-1]=i+" x "+numero+" = "+(i * numero);
		}
		
		//Al ser un arreglo, recorremos el arreglo y bamos enlazando para ir formando la tabla
		//Se toma el numero y se va haciendo las multiplicaciones
		
		//Regresamos el arreglo
		return tablaGenerada;
	}
	
	//Generar n Tablas
	public String[][] generarTablas(int ... numeros) {
		
		
		//														VARIANT
		//int ... numeros 
		/*
		 * 
		 * significa que java recibira n cantidad de numeros java lo tratara como un arreglo de numero int[]
		 * 
		 */
		
		String[][] tablas =  new String[numeros.length][];
		
		/*
		 * Se declara una matriz de numeros y el numero de tablas que se generaran sera del tamaño del arreglo de numeros
		 * El segundo corchete vacio indica que la fila de la matriz sera un arreglo tambnien
		 * 
		 */
		
		int index = 0;
		
		//esto es un for each para cada numero en el arreglo de numeros 
		// y ya se ejecuta el ciclo pasando por cada uno
		for(int numero : numeros) {
			
			//Aqui se reusa el metodo anterior que pues ya funciona 
			String[] tabla = generarTabla(numero);
			//luego se va lleando por renglon completo con el uso del indice y el uso del metodo anterior 
			tablas[index++]= tabla;
			
			
		}
		//Llenada la matriz se regresa completo
		return tablas;
	}
	
	
	//Ahora yo poseo dos metodos que me permiten generar tablas de multplicaion se usaran para crear servicios por medio de un contrato
	
	
	
	
	
}






