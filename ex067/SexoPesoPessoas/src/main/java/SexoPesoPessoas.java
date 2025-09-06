import java.util.Scanner;

public class SexoPesoPessoas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sexo;
        float peso;

        int mulheresCadastradas = 0;
        int homensComMaisDe100Kg = 0;
        float mediaPesoEntreMulheres = 0;
        float maiorPesoDosHomens = 0;

        for (int contador = 1; contador <= 8; contador++) {

            System.out.printf("%d°pessoa Sexo[m/f]: ",contador);
            sexo = scanner.nextLine();

            System.out.printf("%d° pessoa Peso: ", contador);
            peso = scanner.nextFloat();

            scanner.nextLine();

            if (sexo.equals("f")) {

                mulheresCadastradas++;

                mediaPesoEntreMulheres += peso;

            } else {

                if (peso > 100) {

                    homensComMaisDe100Kg++;

                }

                if (peso > maiorPesoDosHomens) {

                    maiorPesoDosHomens = peso;

                }

            }

            System.out.println("------------------");

        }

        mediaPesoEntreMulheres /= mulheresCadastradas;

        System.out.printf("Mulheres cadastradas: %d\n", mulheresCadastradas);
        System.out.printf("Homens com mais de 100kg: %d\n", homensComMaisDe100Kg);
        System.out.printf("Média de peso entre as mulheres: %.1f\n", mediaPesoEntreMulheres);
        System.out.printf("Maior peso entre homens: %.1f\n", maiorPesoDosHomens);

        scanner.close();

    }

}
