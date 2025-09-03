import java.util.Scanner;

public class SalarioSexoFuncionarios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario;
        double salarioMulheres = 0;
        double salarioHomens = 0;

        String sexo;

        String continuar = "s";

        while (continuar.equals("s")) {

            System.out.print("Salário: R$");
            salario = scanner.nextDouble();

            System.out.print("Sexo[m/f]: ");
            sexo = scanner.next();

            if (sexo.equals("m")) {

                salarioHomens += salario;

            } else {

                salarioMulheres += salario;

            }

            System.out.print("Quer continuar?[s/n] ");
            continuar = scanner.next();

        }

        System.out.printf("\nSalário dos homens: R$%.2f\nSalário das mulheres: R$%.2f", salarioHomens, salarioMulheres);

    }

}
