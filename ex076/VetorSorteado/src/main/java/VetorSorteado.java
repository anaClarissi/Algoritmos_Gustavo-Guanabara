import java.util.Random;

public class VetorSorteado {

    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio;

        int[] valores = new int[7];

        for (int valor : valores) {

            numeroAleatorio = random.nextInt(7) + 1;

            valor = numeroAleatorio;

            System.out.printf("%d ", valor);

        }

    }

}
