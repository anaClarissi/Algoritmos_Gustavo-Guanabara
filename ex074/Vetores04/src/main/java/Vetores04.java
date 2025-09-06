public class Vetores04 {

    public static void main(String[] args) {

        int[] valores = new int[10];

        int valorIncluso = 5;

        for (int numero : valores) {

            numero = valorIncluso;

            System.out.printf("%d ", numero);

            if (valorIncluso == 5) {

                valorIncluso = 3;

            } else {

                valorIncluso = 5;

            }

        }

    }

}
