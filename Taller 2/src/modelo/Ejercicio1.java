package modelo;

public class Ejercicio1 extends Thread {

	private static int tam = 2;
	private static int tamC1 = 3;
	private static int[][] primera = new int[tam][tam];
	private static int[][] segunda = new int[tamC1][tam];
	private int[][] resultado = new int[tam][tam];
	private int ini, fin;

	public Ejercicio1(int ini, int fin) {

		this.ini = ini;
		this.fin = fin;
	}

	public Ejercicio1() {

	}

	@Override
	public void run() {

		/**
		 * Se llena la primera matriz
		 */
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				primera[i][j] = (int) (Math.random() * 5);
				System.out.print(primera[i][j]);
			}
			System.out.println("\t");
		}

		/**
		 * Se llena la segunda matriz
		 */
		for (int i = 0; i < tamC1; i++) {
			for (int j = 0; j < tam; j++) {
				segunda[i][j] = (int) (Math.random() * 5);
			}
		}

		/**
		 * Multiplicacion
		 */

		for (int i = 0; i < 4; i++) {
			if (resultado[0][0] == 0) {
				int aux = (primera[0][0] * segunda[0][0]) + (primera[0][1] * segunda[1][0])
						+ (primera[0][2] * segunda[2][0]);
				resultado[0][0] = aux;
			} else if (resultado[1][0] == 0) {
				int aux = (primera[1][0] * segunda[0][0]) + (primera[1][1] * segunda[1][0])
						+ (primera[1][2] * segunda[2][0]);
				resultado[1][0] = aux;
			} else if (resultado[0][1] == 0) {
				int aux = (primera[0][0] * segunda[0][1]) + (primera[0][1] * segunda[1][1])
						+ (primera[0][2] * segunda[2][1]);
				resultado[0][1] = aux;
			} else if (resultado[1][1] == 0) {
				int aux = (primera[1][0] * segunda[0][1]) + (primera[1][1] * segunda[1][1])
						+ (primera[1][2] * segunda[2][1]);
				resultado[1][1] = aux;
			}
		}
		mostrar(primera);
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

	public static int getTam() {
		return tam;
	}

	public static void setTam(int tam) {
		Ejercicio1.tam = tam;
	}

	public int[][] getResultado() {
		return resultado;
	}

	public void setResultado(int[][] resultado) {
		this.resultado = resultado;
	}

}
