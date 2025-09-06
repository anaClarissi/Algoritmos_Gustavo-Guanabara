import java.util.Scanner;

public class SequenciaDeFibonacci {

    public static void main(String[] args) {

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.printf("%d %d ", primeiroTermo, segundoTermo);

        for (int contador = 3; contador <= 10; contador++) {

            int terceiroTermo = primeiroTermo + segundoTermo;

            System.out.printf("%d ", terceiroTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = terceiroTermo;

        }

    }

}
