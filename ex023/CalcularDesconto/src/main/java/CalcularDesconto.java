import java.util.Scanner;

public class CalcularDesconto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Gênero[f/m]: ");
        String genero = scanner.nextLine();

        System.out.print("Preço do produto: R$");
        double valorCompras = scanner.nextDouble();

        float desconto;

        if (genero.equals("f")) {

            desconto = 0.13f;

        } else {

            desconto = 0.05f;

        }

        double novoValorCompras = valorCompras - (valorCompras * desconto);

        System.out.printf("Nome: %s\nGênero: %s\nValor do produto: R$%.2f\nValor com desconto: %.2f", nome, genero, valorCompras, novoValorCompras);

    }

}
