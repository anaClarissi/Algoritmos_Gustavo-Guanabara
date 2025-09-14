import java.util.Scanner;

public class CalcularPotencia {

	public static int potencia (int base, int expoente) {

		int numero = 1;

		for (int i = 0; i < expoente; i++) {

			numero *= base;

		}

		return numero;

	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a base: ");
		int base = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Digite o expoente: ");
		int expoente = scanner.nextInt();

		scanner.nextLine();

		System.out.printf("Resultado: %d", potencia(base, expoente));

		scanner.close();

	}

}
