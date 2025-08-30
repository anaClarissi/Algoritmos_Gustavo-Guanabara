import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        int numeroSucessor = numeroDigitado + 1;
        int numeroAntecessor = numeroDigitado - 1;

        System.out.printf("O Antecessor de %d é %d\n", numeroDigitado, numeroAntecessor);
        System.out.printf("O Sucessor de %d é %d", numeroDigitado, numeroSucessor);


    }


}
