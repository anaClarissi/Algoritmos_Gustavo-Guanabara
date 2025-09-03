public class CalcularExpressao {

    public static void main(String[] args) {

        int resultado = 0;

        int contador = 500;

        while (contador >= 0) {

            resultado += contador;

            contador += 50;

        }

        System.out.printf("Resultado: %d", resultado);

    }

}
