import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dias trbalhados: ");
        int diasTrabalhados = scanner.nextInt();

        float salarioDoFuncionario = (8 * 25) * diasTrabalhados;

        System.out.printf("Salário do Funcionario: R$%.2f", salarioDoFuncionario);

    }

}
