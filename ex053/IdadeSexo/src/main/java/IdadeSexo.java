import java.util.Scanner;

public class IdadeSexo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        String sexo;

        int homensCadastrados = 0;
        int mulheresCadastradas = 0;

        int somaIdades = 0;
        float mediaIdade;

        int somaIdadeHomens = 0;
        float mediaIdadeHomens;

        int mulheresMais20 = 0;

        int contador = 1;

        while (contador <= 5) {

            System.out.printf("Idade pessoa %d: ", contador);
            idade = scanner.nextInt();

            System.out.printf("Sexo pessoa %d(m/f): ", contador);
            sexo = scanner.next();

            somaIdades += idade;

            if (sexo.equals("m")) {

                homensCadastrados++;

                somaIdadeHomens += idade;

            } else {

                mulheresCadastradas++;

                if (idade > 20) {

                    mulheresMais20++;

                }

            }

            contador++;

        }

        mediaIdade = (float) somaIdades / 10;

        mediaIdadeHomens = (float) somaIdadeHomens / 10;

        System.out.printf("\nHomens cadastrados: %d\nMulheres cadastradas: %d\nMédia do grupo: %.1f\nMedia dos homens: %.1f\nMulheres com mais de 20: %d", homensCadastrados, mulheresCadastradas,mediaIdade,mediaIdadeHomens, mulheresMais20);

    }

}
