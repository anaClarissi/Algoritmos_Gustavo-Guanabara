import java.util.Random;
import java.util.Scanner;

public class NumeroSorteado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("O Computador pensará em um número...");
        int numeroSorteado = random.nextInt(5) + 1;

        System.out.print("Digite um número (1 a 5): ");
        int numeroUsuario = scanner.nextInt();

        System.out.printf("Numero Sorteado: %d\n", numeroSorteado);

        if (numeroUsuario == numeroSorteado) {

            System.out.println("Você Acertou!");

        } else {

            System.out.println("Você Errou!");

        }

    }

}
