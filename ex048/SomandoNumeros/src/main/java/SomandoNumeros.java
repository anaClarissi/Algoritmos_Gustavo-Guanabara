import java.util.Scanner;

public class SomandoNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int contador = 1;

        while (contador <= 7) {

            System.out.printf("%dº número: ",contador);
            soma += scanner.nextInt();

            contador++;

        }

        System.out.printf("Soma de todos os valores: %d", soma);

    }

}
