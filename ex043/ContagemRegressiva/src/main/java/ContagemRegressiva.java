public class ContagemRegressiva {

    public static void main(String[] args) {

        int contador = 30;

        while (contador >= 1) {

            if (contador % 4 == 0) {

                System.out.printf("[%d] ", contador);

            } else {

                System.out.printf("%d ", contador);

            }

            contador--;

        }

    }

}
