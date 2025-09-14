import java.util.Scanner;

public class MaiorNumero {

	public static void maior(double numero1, double numero2) {

		System.out.println("========Resultado========");
		if (numero1 > numero2) {
	
			System.out.printf("%f > %f", numero1, numero2);		

		} else if (numero1 < numero2) {

			System.out.printf("%f > %f", numero2, numero1);

		} else {

			System.out.printf("%f == %f", numero1, numero2);

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Primeiro valor: ");
		double primeiroValor = scanner.nextDouble();

		System.out.print("Segundo valor: ");
		double segundoValor = scanner.nextDouble();

		maior(primeiroValor, segundoValor);

		scanner.close();

	}

}
