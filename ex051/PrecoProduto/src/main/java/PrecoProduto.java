import java.util.Scanner;

public class PrecoProduto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precoProduto;

        double maiorPreco = 0;
        double menorPreco = Double.MAX_VALUE;

        int contador = 1;

        while (contador <= 8) {

            System.out.printf("%dº Produto: R$", contador);
            precoProduto = scanner.nextDouble();

            if (precoProduto > maiorPreco) {

                maiorPreco = precoProduto;

            }

            if (precoProduto < menorPreco) {

                menorPreco = precoProduto;

            }

            contador++;

        }

        System.out.printf("\nMaior Preço: R$%.2f\nMenor Preço: R$%.2f", maiorPreco, menorPreco);

    }

}
