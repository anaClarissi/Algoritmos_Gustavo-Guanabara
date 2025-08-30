import java.util.Scanner;

public class NumeroReal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numeroUsuario = scanner.nextFloat();

        float dobroDoNumero = numeroUsuario * 2;
        float tercaParteDoNumero = numeroUsuario / 3;

        System.out.printf("O dobro de %.2f é %.2f\n", numeroUsuario, dobroDoNumero);
        System.out.printf("A terça parte de %.2f é %.2f", numeroUsuario, tercaParteDoNumero);

    }

}
