import java.util.Scanner;

public class ProgressaoAritmetica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão: ");
        int razao = scanner.nextInt();

        int pa;

        int somaDosTermos = 0;

        for (int contador = 1; contador <= 10; contador++) {

            pa = primeiroTermo + (contador - 1) * razao;

            System.out.printf("%d ",pa);

            somaDosTermos += pa;


        }

        System.out.printf("\nSoma dos termos: %d", somaDosTermos);

        scanner.close();

    }

}
