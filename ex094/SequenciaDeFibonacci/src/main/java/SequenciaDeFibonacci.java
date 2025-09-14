import java.util.Scanner;

public class SequenciaDeFibonacci {

	public static void fibonacci (int numeroTermos) {

		int[] sequencia = new int[numeroTermos];

		sequencia[0] = 1;
		sequencia[1] = 1;

		for (int numero = 2; numero < sequencia.length; numero++) {
	
			sequencia[numero] = sequencia[numero - 1] + sequencia[numero - 2];

		}

		for (int numero : sequencia) {

			System.out.printf("%d >> ", numero);

		}

		System.out.print("FIM");

	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite quantos termos: ");
		int termos = scanner.nextInt();
		scanner.nextLine();

		fibonacci(termos);

		scanner.close();

	}

}
