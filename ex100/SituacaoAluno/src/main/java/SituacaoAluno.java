import java.util.Scanner;

public class SituacaoAluno {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantidade de notas: ");
		int quantidade = scanner.nextInt();

		double[] listaNotas = new double[quantidade];

		for (int i = 0; i < listaNotas.length; i++) {

			System.out.printf("%dº nota: ", i + 1);
			listaNotas[i] = scanner.nextDouble();

			scanner.nextLine();

		}

		System.out.printf("Média: %.1f\n", media(listaNotas));
		System.out.printf("Status do aluno: %s", situacao(media(listaNotas)));

		scanner.close();

	}

	public static double media (double[] notas) {

		double somaNotas = 0;

		for (double nota : notas) {

			somaNotas += nota;

		}
	
		return somaNotas / notas.length;

	}

	public static String situacao (double media) {

		String status;

		if (media < 4) {

			status = "REPROVADO";

		} else if (media < 7) {

			status = "RECUPERAÇÃO";			

		} else {

			status = "APROVADO";

		}

		return status;

	}

}
