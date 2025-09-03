import java.util.Scanner;

public class AlgoritmoPessoas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String sexo;
        String pessoaMaisvelha = "";
        String mulherMaisJovem = "";

        int idade;
        int maiorIdade = 0;
        int menorIdadeMulher = Integer.MAX_VALUE;
        int somaIdades = 0;
        int homemMaisDe30 = 0;
        int mulheresMenosDe18 = 0;
        float mediaIdades;
        int quantidadePessoas = 0;

        String continuar = "s";

        while (continuar.equals("s")) {

            System.out.print("Nome: ");
            nome = scanner.nextLine();

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Sexo: ");
            sexo = scanner.nextLine();

            if (idade > maiorIdade) {

                maiorIdade = idade;

                pessoaMaisvelha = nome;

            }

            if (sexo.equals("f")) {

                if (idade < menorIdadeMulher) {

                    menorIdadeMulher = idade;

                    mulherMaisJovem = nome;

                }

                if (idade < 18) {

                    mulheresMenosDe18++;

                }

            } else {

                if (idade > 30) {

                    homemMaisDe30++;

                }

            }

            somaIdades += idade;

            quantidadePessoas++;

            System.out.print("Quer continuar?[s/n]: ");
            continuar = scanner.nextLine();

        }

        mediaIdades = (float) somaIdades / quantidadePessoas;

        System.out.printf("\nPessoa mais velha: %s\n", pessoaMaisvelha);
        System.out.printf("Mulher mais jovem: %s\n", mulherMaisJovem);
        System.out.printf("Média de idade: %.1f\n", mediaIdades);
        System.out.printf("Homens mais de 30: %d\n", homemMaisDe30);
        System.out.printf("Mulheres menos de 18: %d", mulheresMenosDe18);

        scanner.close();

    }

}
