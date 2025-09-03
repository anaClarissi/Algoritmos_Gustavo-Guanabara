import java.util.Scanner;

public class ProgramaPessoas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        int maiorIdadeLida = 0;

        int idadeHomens = 0;
        int homensCadastrados = 0;
        float mediaIdadeHomens;

        int idadeMulherMaisJovem = Integer.MAX_VALUE;

        String sexo;

        String continuar = "s";

        while (continuar.equals("s")) {

            System.out.print("Sexo: ");
            sexo = scanner.nextLine();

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            scanner.nextLine();

            if (idade > maiorIdadeLida) {

                maiorIdadeLida = idade;

            }

            if (sexo.equals("m")) {

                homensCadastrados++;

                idadeHomens += idade;

            } else {

                if (idade < idadeMulherMaisJovem) {

                    idadeMulherMaisJovem = idade;

                }

            }

            System.out.print("Quer continuar?[s/n]");
            continuar = scanner.nextLine();

        }

        mediaIdadeHomens = (float) idadeHomens / homensCadastrados;

        System.out.printf("\nMaior idade lida: %d\n", maiorIdadeLida);
        System.out.printf("Homens cadastrados: %d\n", homensCadastrados);
        System.out.printf("Mulher mais jovem: %d\n", idadeMulherMaisJovem);
        System.out.printf("Media da idade dos homens: %.1f", mediaIdadeHomens);

        scanner.close();

    }

}
