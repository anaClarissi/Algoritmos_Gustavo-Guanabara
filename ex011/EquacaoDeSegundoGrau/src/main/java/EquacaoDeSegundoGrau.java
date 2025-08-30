import java.util.Scanner;

public class EquacaoDeSegundoGrau {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a constante A: ");
        int valorA = scanner.nextInt();

        System.out.print("Digite a constante B: ");
        int valorB = scanner.nextInt();

        System.out.print("Digite a constante C: ");
        int valorC = scanner.nextInt();

        int delta = (valorB * valorB) - (4 * valorA * valorC);

        System.out.printf("O valor de delta é: %d", delta);

    }

}
