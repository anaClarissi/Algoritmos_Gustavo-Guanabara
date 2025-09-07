import java.util.Scanner;

public class NumeroMultiplosDe10 {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] listaNumeros = new int[15];

		for (int posicao = 0; posicao < listaNumeros.length; posicao++) {

			System.out.printf("%dº Número: ", posicao + 1);
			listaNumeros[posicao] = scanner.nextInt();

			scanner.nextLine();

		}
		
		System.out.println("-----Lista de Números------");
		
		for (int valor : listaNumeros) {

			System.out.printf("%d \n", valor);
	
		}
	
		System.out.println("--Numeros Multiplos de 10 --");

		for (int posicao = 0; posicao < listaNumeros.length; posicao++){

			if (listaNumeros[posicao] % 10 == 0){

				System.out.printf("%d na posição: %d \n", listaNumeros[posicao], posicao + 1);	

			}

		}

		scanner.close();
	
	}

}
