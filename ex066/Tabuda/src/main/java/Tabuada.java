import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int contador = 1; contador <= 10; contador++) {

            System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);

        }

        System.out.println("Fim!");

        scanner.close();

    }

}
