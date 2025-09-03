import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {

        Random random = new Random();
        int numeroSorteado;

        int numerosDivisivelPor3 = 0;
        int numerosAcimaDe5 = 0;

        int contador = 1;

        while (contador <= 20) {

            numeroSorteado = random.nextInt(11);

            System.out.printf("%d ", numeroSorteado);

            if (numeroSorteado % 3 == 0 && numeroSorteado > 0) {

                numerosDivisivelPor3++;

            }

            if (numeroSorteado > 5) {

                numerosAcimaDe5++;

            }

            contador++;

        }

        System.out.printf("\nNumeros divisiveis por 3: %d\nNumeros acima de 5: %d", numerosDivisivelPor3, numerosAcimaDe5);

    }

}
