import java.util.Scanner;

public class SomandoValores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.print("Digite outro valor: ");
        int segundoValor = scanner.nextInt();

        int soma = primeiroValor + segundoValor;

        System.out.printf("A soma entre %d e %d é %d", primeiroValor, segundoValor, soma);

    }

}
