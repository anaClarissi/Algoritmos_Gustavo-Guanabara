import java.util.Scanner;

public class AumentoSalarial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário atual: R$");
        float salarioAtual = scanner.nextFloat();

        float aumento = 0.15f;
        float salarioComAumento = salarioAtual + (salarioAtual * aumento);

        System.out.printf("O seu novo salário é: R$%.2f", salarioComAumento);

    }

}
