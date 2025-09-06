public class Vetores03 {

    public static void main(String[] args) {

        int[] valores = new int[10];

        int valorIncluso = 9;

        for (int valor : valores) {

            valor = valorIncluso;

            System.out.printf("%d ", valor);

            valorIncluso--;

        }

    }

}
