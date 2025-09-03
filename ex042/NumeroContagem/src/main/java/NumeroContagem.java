import java.util.Scanner;

public class NumeroContagem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        int contador = 1;

        while (contador <= numeroDigitado) {

            System.out.printf("%d ", contador);

            contador++;

        }

        System.out.println("Acabou!");

        scanner.close();

    }

}
