import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.print("Salário: R$");
        float salarioFuncionario = scanner.nextFloat();

        System.out.print("Anos na empresa: ");
        int anosNaEmpresa = scanner.nextInt();

        float novoSalarioFuncionario;

        if (anosNaEmpresa < 3) {
            
            novoSalarioFuncionario = salarioFuncionario + (salarioFuncionario * 0.03f);
            
        } else if (anosNaEmpresa >= 10) {

            novoSalarioFuncionario = salarioFuncionario + (salarioFuncionario * 0.2f);
            
        } else {

            novoSalarioFuncionario = salarioFuncionario + (salarioFuncionario * 0.125f);

        }

        System.out.printf("Nome: %s\nSalário atual: R$%.2f\nAnos na Empresa: %d\nNovo Salário: R$%.2f", nomeFuncionario, salarioFuncionario, anosNaEmpresa, novoSalarioFuncionario);

    }

}
