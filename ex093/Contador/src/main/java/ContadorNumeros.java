import java.util.Scanner;

public class ContadorNumeros {

	public static void contador (int inicio, int fim, int passo) {

		for (int i = inicio; i <= fim; i += passo) {

			System.out.printf("%d >> ", i);

		}

		System.out.print("FIM");

	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o inicio: ");
		int inicio = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Digite o fim: ");
		int fim = scanner.nextInt();	
		scanner.nextLine();

		System.out.print("Digite o passo: ");
		int passo = scanner.nextInt();
		scanner.nextLine();

		contador(inicio, fim, passo);

		scanner.close();

	}

}
