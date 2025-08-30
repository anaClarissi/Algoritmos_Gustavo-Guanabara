import java.util.Scanner;

public class PrecoPromocional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto: R$");
        float valorDoProduto = scanner.nextFloat();

        float desconto = 0.05f;
        float valorComDesconto = valorDoProduto - (valorDoProduto * desconto);

        System.out.printf("O valor promocional é R$%.2f", valorComDesconto);


    }

}
