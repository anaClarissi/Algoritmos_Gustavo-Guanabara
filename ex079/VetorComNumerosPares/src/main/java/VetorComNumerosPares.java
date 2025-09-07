import java.util.Scanner;

public class VetorComNumerosPares {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int[] listaNumeros = new int[10];

		for (int posicao = 0; posicao < listaNumeros.length; posicao++){
	
			System.out.printf("%dº Número: ", posicao + 1);
			listaNumeros[posicao] = scanner.nextInt();

		}

		System.out.println("--Numeros Pares--");
		
		for (int posicao = 0; posicao < listaNumeros.length; posicao++){

			if (listaNumeros[posicao] % 2 == 0){

				System.out.printf("%d na posicao %d\n", listaNumeros[posicao], posicao + 1);

			}

		}

		scanner.close();

	}

}
