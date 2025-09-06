public class Vetores02 {

    public static void main(String[] args) {

        int[] valores = new int[10];

        int valorIncluso = 0;

        for (int contador = 0; contador < valores.length; contador++){

            valorIncluso += 5;

            valores[contador] = valorIncluso;

            System.out.printf("%d ", valores[contador]);

        }

    }

}
