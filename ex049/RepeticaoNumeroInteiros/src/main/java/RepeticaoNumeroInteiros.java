import java.util.Scanner;

public class RepeticaoNumeroInteiros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        int contador = 1;

        while (contador <= 6) {

            System.out.printf("%dº Número: ", contador);
            numero = scanner.nextInt();

            if (numero % 2 == 0) {

                quantidadePares++;

            } else {

                quantidadeImpares++;

            }

            contador++;

        }

        System.out.printf("Numeros Pares: %d\nNumeros Ímpares: %d", quantidadePares, quantidadeImpares);

    }

}
