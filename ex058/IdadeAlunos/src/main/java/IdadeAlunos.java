import java.util.Scanner;

public class IdadeAlunos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdade = 0;
        int quantidadeAlunos = 0;
        float mediaIdade;

        while (true) {

            System.out.print("Idade do aluno[999 interrompe]: ");
            idade = scanner.nextInt();

            if (idade == 999) {

                break;

            }

            somaIdade += idade;

            quantidadeAlunos++;

        }

        mediaIdade = (float) somaIdade / quantidadeAlunos;

        System.out.printf("Quantidade de Alunos: %d\nMédia das Idades: %.1f", quantidadeAlunos, mediaIdade);

    }

}
