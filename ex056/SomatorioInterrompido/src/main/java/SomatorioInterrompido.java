import java.util.Scanner;

public class SomatorioInterrompido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDigitados;

        int soma = 0;

        while (true) {

            System.out.print("Digite um número [111 interrompe]: ");
            numeroDigitados = scanner.nextInt();

            if (numeroDigitados == 111) {

                System.out.println("Saindo...");

                break;

            }

            soma += numeroDigitados;

        }

        System.out.printf("A soma de todos os valores é: %d", soma);

    }

}
