public class Vetores05 {

    public static void main(String[] args) {

        int[] valores = new int[16];

        valores[0] = 1;
        valores[1] = 1;

        System.out.printf("%d %d ", valores[0], valores[1]);

        for (int valor = 2; valor < valores.length; valor++) {

            valores[valor] = valores[valor - 1] + valores[valor - 2];

            System.out.printf("%d ", valores[valor]);

        }

    }

}
