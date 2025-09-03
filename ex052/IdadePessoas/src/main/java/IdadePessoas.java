import java.util.Scanner;

public class IdadePessoas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        int somaIdades = 0;
        float mediaIdade;

        int pessoasMais18 = 0;
        int pessoasMenos5 = 0;
        int maiorIdade = 0;

        int contador = 1;

        while (contador <= 10) {

            System.out.printf("Idade da pessoa %d: ", contador);
            idade = scanner.nextInt();

            somaIdades += idade;

            if (idade > 18) {

                pessoasMais18++;

            }

            if (idade < 5) {

                pessoasMenos5++;

            }

            if (idade > maiorIdade) {

                maiorIdade = idade;

            }

            contador++;

        }

        mediaIdade = (float) somaIdades / 10;

        System.out.printf("\nMédia de Idade: %.1f\nPessoas mais 18: %d\nPessoas menos 5: %d\nMaior idade: %d", mediaIdade, pessoasMais18, pessoasMenos5, maiorIdade);

        scanner.close();

    }

}
