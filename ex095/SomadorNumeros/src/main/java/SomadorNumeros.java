import java.util.Scanner;

public class SomadorNumeros {

	public static int somador (int numero1, int numero2) {

		return numero1 + numero2;

	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Primeiro número: ");
		int primeiroNumero = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Segundo número: ");
		int segundoNumero = scanner.nextInt();
		scanner.close();

		System.out.printf("%d + %d = %d", primeiroNumero, segundoNumero, somador(primeiroNumero, segundoNumero));

		scanner.close();

	}

}
