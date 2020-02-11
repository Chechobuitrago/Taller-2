package modelo;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Ejercicio1 extends Thread {

	private static int tam = 8;
	private static int tamC1 = 5;
	private static int[][] primera = new int[tam][tam];
	private static int[][] segunda = new int[tamC1][tam];
	private int[][] resultado = new int[tam][tam];
	private int ini, fin;

	public Ejercicio1(int ini, int fin) {

		this.ini = ini;
		this.fin = fin;
	}

	@Override
	public void run() {

	}

	public void mostrar(int[][] resultado) {
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {
				System.out.print(resultado[i][j]);
				if (j != resultado[i].length - 1) {
					System.out.println("\t");
				}
			}
		}
	}

	public int[][] getResultado() {
		return resultado;
	}

	public void setResultado(int[][] resultado) {
		this.resultado = resultado;
	}

}
