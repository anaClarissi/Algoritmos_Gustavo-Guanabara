import java.util.Scanner;

public class Carteira {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu dinheiro: R$");
        float dinheiroReal = scanner.nextFloat();

        float dollar = dinheiroReal * 5;
        float poderDeCompra = dollar / dinheiroReal;

        System.out.printf("Com R$%.2f você pode comprar $%.2f", dinheiroReal, poderDeCompra);

    }

}
