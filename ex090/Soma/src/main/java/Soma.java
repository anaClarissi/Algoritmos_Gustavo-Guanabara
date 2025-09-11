import java.util.Scanner;

public class Soma {

    public static void soma(int numero1, int numero2) {

        System.out.printf("%d + %d = %d", numero1, numero2, numero1 + numero2);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int valor1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Valor 2: ");
        int valor2 = scanner.nextInt();

        soma(valor1, valor2);

        scanner.close();

    }

}
