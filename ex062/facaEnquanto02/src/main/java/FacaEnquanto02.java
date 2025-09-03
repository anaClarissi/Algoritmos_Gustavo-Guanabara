import java.util.Scanner;

public class FacaEnquanto02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdade = 0;
        int quantidadePessoas = 0;
        int pessoasMaisDe21 = 0;
        float mediaIdades;

        String continuar;

        do {

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            scanner.nextLine();

            somaIdade += idade;

            quantidadePessoas++;

            if (idade > 21) {

                pessoasMaisDe21++;

            }

            System.out.print("Quer continuar?[s/n] ");
            continuar = scanner.nextLine();

        } while (continuar.equals("s"));

        mediaIdades = (float) somaIdade / quantidadePessoas;

        System.out.printf("\nIdades registradas: %d\n", quantidadePessoas);
        System.out.printf("Média das idades: %.1f\n", mediaIdades);
        System.out.printf("Pessoas mais de 21: %d", pessoasMaisDe21);

        scanner.close();

    }

}
