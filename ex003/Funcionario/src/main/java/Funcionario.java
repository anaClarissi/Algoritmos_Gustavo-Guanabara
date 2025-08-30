import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeDoFuncionario = scanner.nextLine();

        System.out.print("Digite seu salário: R$");
        float salarioDoFuncionario = scanner.nextFloat();

        System.out.print("Digite o mês atual: ");
        String mesAtual = scanner.next();

        System.out.printf("O funcionário %s tem um salário de R$%.2f em %s", nomeDoFuncionario, salarioDoFuncionario,mesAtual);

    }

}
