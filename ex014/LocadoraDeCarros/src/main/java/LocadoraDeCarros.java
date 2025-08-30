import java.util.Scanner;

public class LocadoraDeCarros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Km percorridos pelo carro alugado: ");
        float kmPercorridos = scanner.nextFloat();

        System.out.print("Quantidade de dias: ");
        int diasAlugados = scanner.nextInt();

        float precoTotal = (diasAlugados * 90) + (kmPercorridos * 0.20f);

        System.out.printf("O valor total a pagar é: R$%.2f", precoTotal);

    }

}
