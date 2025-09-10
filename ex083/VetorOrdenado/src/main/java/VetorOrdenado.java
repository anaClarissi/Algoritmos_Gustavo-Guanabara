import java.util.Random;

public class VetorOrdenado {

	public static void main(String[] args){
		
		Random random = new Random();

		int[] listaNumeros = new int[20];

		int numeroOrdenado;

		for (int posicao = 0; posicao < listaNumeros.length; posicao++){

			listaNumeros[posicao] = random.nextInt(99);

			System.out.printf("%d ", listaNumeros[posicao]);

		}

		System.out.println();

		for (int posicao = 0; posicao < listaNumeros.length - 1; posicao++) {

			for (int segundaPosicao = 0; segundaPosicao < listaNumeros.length - 1 - posicao; segundaPosicao++) {

				if (listaNumeros[segundaPosicao] > listaNumeros[segundaPosicao + 1]) {

					numeroOrdenado = listaNumeros[segundaPosicao];
					listaNumeros[segundaPosicao] = listaNumeros[segundaPosicao + 1];
					listaNumeros[segundaPosicao + 1] = numeroOrdenado;

				}

			}

		}

		for (int numero : listaNumeros) {

			System.out.printf("%d ", numero);

		}

	}

}
