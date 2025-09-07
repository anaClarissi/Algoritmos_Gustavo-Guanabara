import java.util.Scanner;

public class VetorComNotas {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		double[] listaNotas = new double[10];

		double mediaTurma = 0;

		int alunosAcimaDaMedia = 0;

		double maiorNota = 0;

		for (int posicao = 0; posicao < listaNotas.length; posicao++){

			System.out.printf("%dº Nota: ", posicao + 1);
			listaNotas[posicao] = scanner.nextDouble();

		}

		for (double nota : listaNotas){

			mediaTurma += nota;

		}

		mediaTurma /= listaNotas.length;
		
		System.out.printf("\nMédia da turma: %.1f\n", mediaTurma);

		for (double nota : listaNotas){

			if (nota > mediaTurma){

				alunosAcimaDaMedia++;

			}

		}

		System.out.printf("Alunos acima da média: %d\n", alunosAcimaDaMedia);

		for (double nota : listaNotas){

			if (nota > maiorNota){

				maiorNota = nota;

			}

		}

		System.out.printf("Maior nota: %.1f\n", maiorNota);

		System.out.print("Posição da Maior Nota: ");
	
		for (int posicao = 0; posicao < listaNotas.length; posicao++){

			if (listaNotas[posicao] == maiorNota){

				System.out.printf("%d ", posicao + 1);

			}

		}

		scanner.close();

	}

}
