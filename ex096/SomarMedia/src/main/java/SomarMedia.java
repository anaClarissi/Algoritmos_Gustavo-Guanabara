import java.util.Scanner;

public class SomarMedia {

	public static double media (double[] notas) {

		double soma = 0;
		
		for (double nota : notas) {

			soma += nota;

		}

		return soma / notas.length;

	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de notas: ");
		int quantidadeNotas = scanner.nextInt();
		scanner.nextLine();

		double[] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++ ) {

			System.out.printf("Digite a %dº nota: ", i + 1);
			notas[i] = scanner.nextDouble();

		}
	
		System.out.printf("Média: %.1f", media(notas));

		scanner.close();

	}

}
