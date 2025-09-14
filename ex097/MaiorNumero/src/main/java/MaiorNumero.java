import java.util.Scanner;

public class MaiorNumero {

	public static double maior (double[] numeros) {

		double maiorNumero = numeros[0];

		for (int i = 1; i < numeros.length; i++) {

			if (maiorNumero < numeros[i]) {

				maiorNumero = numeros[i];

			}

		}

		return maiorNumero;

	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos números você quer comparar? ");
		int quantidadeNumero = scanner.nextInt();
		
		double[] listaNumeros = new double[quantidadeNumero];

		for (int i = 0; i < listaNumeros.length; i++) {

			System.out.printf("%dº número: ", i + 1);
			listaNumeros[i] = scanner.nextDouble();
			scanner.nextLine();

		}

		System.out.printf("Maior número: %f", maior(listaNumeros));

		scanner.close();

	}

}
