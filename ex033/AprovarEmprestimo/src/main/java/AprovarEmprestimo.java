import java.util.Scanner;

public class AprovarEmprestimo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da casa: R$");
        double valorCasa = scanner.nextDouble();

        System.out.print("Salário do comprador: R$");
        double salarioComprador = scanner.nextDouble();

        System.out.print("Anos para pagar: ");
        int anosPagar = scanner.nextInt();

        double prestacaoMensal = valorCasa / (anosPagar * 12);

        if (prestacaoMensal > salarioComprador * 0.3) {

            System.out.println("Emprestimo Negado!");

        } else  {

            System.out.println("Emprestimo Aprovado!");

        }

        System.out.printf("Prestação: R$%.2f por %d meses", prestacaoMensal, anosPagar * 12);

    }

}
