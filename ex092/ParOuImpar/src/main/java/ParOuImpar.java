import java.util.Scanner;

public class ParOuImpar {

	public static void parOuImpar (int numero) {

		if (numero % 2 == 0) {

			System.out.printf("O número %d é PAR!", numero);

		} else {

			System.out.printf("O número %d é IMPAR!", numero);

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		scanner.nextLine();

		parOuImpar(numero);

		scanner.close();

	}

}
