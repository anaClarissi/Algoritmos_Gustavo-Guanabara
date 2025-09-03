import java.util.Random;
import java.util.Scanner;

public class NumeroSorteado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numeroSorteado;
        int numeroDigitado;

        System.out.println("O computador pensará em um número entre 1 e 10");

        int tentativas = 1;

        while (tentativas <= 4) {

            numeroSorteado = random.nextInt(10) + 1;

            System.out.printf("%d° Tentativa: ", tentativas);
            numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numeroSorteado) {

                System.out.println("Você Acertou!");

            } else {

                System.out.println("Você Perdeu!");

            }

            tentativas++;

        }

    }

}
