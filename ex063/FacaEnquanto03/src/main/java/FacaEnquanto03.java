import java.util.Scanner;

public class FacaEnquanto03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valores;
        int somaValores = 0;
        int menorValor = Integer.MAX_VALUE;
        int quantidadeValores = 0;
        float media;
        int valoresPares = 0;

        String continuar;

        do {

            System.out.print("Digite um valores: ");
            valores = scanner.nextInt();

            scanner.nextLine();

            somaValores += valores;

            quantidadeValores++;

            if (valores < menorValor) {

                menorValor = valores;

            }

            if (valores % 2 == 0) {

                valoresPares++;

            }

            System.out.print("Quer continuar?[s/n] ");
            continuar = scanner.nextLine();

        } while (continuar.equals("s"));

        media = (float) somaValores / quantidadeValores;

        System.out.printf("\nSomatório dos valores: %d\n", somaValores);
        System.out.printf("Menor valor: %d\n", menorValor);
        System.out.printf("Média valores: %.1f\n", media);
        System.out.printf("Valores pares: %d\n", valoresPares);

        scanner.close();

    }

}
