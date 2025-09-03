import java.util.Scanner;

public class ContagemDigitada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor inicial da Contagem: ");
        int valorinicial = scanner.nextInt();

        System.out.print("Valor final: ");
        int valorFinal = scanner.nextInt();

        System.out.print("Incremento: ");
        int incremento = scanner.nextInt();

        while (valorinicial <= valorFinal) {

            System.out.printf("%d ", valorinicial);

            valorinicial += incremento;

        }

        System.out.println("Acabou!");

        scanner.close();

    }

}
