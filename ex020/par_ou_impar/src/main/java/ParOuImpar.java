import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        String statusNumero;

        if (numeroDigitado % 2 == 0){
            statusNumero = "Par";
        } else {
            statusNumero = "impar";
        }

        System.out.printf("O número %d é: %s", numeroDigitado, statusNumero);

    }

}
