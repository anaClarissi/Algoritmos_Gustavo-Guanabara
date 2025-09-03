public class RepeticaoSoma {

    public static void main(String[] args) {

        int soma = 0;

        int contador = 6;

        while (contador <= 100) {

            soma += contador;

            contador += 2;

        }

        System.out.printf("Soma de todos os números: %d", soma);

    }

}
