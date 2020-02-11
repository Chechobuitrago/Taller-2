package lanzador;

import java.util.Random;

import modelo.Ejercicio1;

public class AplMain_Ejercicio1 {

	public static void main(String[] args) {
		
		Ejercicio1 x= new Ejercicio1(0, 0);
		/**
		 * Obtener el numero de procesadores logicos
		 */
		Runtime runtime = Runtime.getRuntime();
		int procesadoresLogicos = runtime.availableProcessors();

		System.out.println("------Multiplicacion de matrices-----");
		System.out.println("\n");

		Random rand = new Random(System.nanoTime());

		
		
		
		Thread[] hilos = new Thread[procesadoresLogicos];
	}

}
