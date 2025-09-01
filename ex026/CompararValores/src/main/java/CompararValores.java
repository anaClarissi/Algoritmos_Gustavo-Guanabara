import java.util.Scanner;

public class CompararValores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.print("Segundo valor: ");
        int segundoValor = scanner.nextInt();


        if (primeiroValor > segundoValor) {

            System.out.printf("O valor %d é maior", primeiroValor);

        } else if (primeiroValor < segundoValor) {

            System.out.printf("O valor %d é maior", segundoValor);

        } else {

            System.out.println("Os dois valores são iguais!");

        }

    }

}
