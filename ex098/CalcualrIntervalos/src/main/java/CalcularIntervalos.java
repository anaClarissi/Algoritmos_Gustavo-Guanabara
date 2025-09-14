import java.util.Scanner;

public class CalcularIntervalos {

	public static int superSomador (int valor1, int valor2) {

		int somaValores = 0;

		for (int i = valor1; i <= valor2; i++) {

			somaValores += i;

		}

		return somaValores;

	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Digite o primeiro valor: ");
		int primeiroValor = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Digite o último valor: ");
		int ultimoValor = scanner.nextInt();

		scanner.nextLine();

		System.out.printf("Soma dos valores de %d a %d : %d", primeiroValor, ultimoValor, superSomador(primeiroValor, ultimoValor));
		
		scanner.close();

	}

}
