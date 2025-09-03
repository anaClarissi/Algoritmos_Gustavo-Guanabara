import java.util.Scanner;

public class ContagemPara {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int contador = 0; contador <= numero; contador++) {

            System.out.printf("%d, ", contador);

        }

        System.out.print("Fim!");

        scanner.close();

    }

}
