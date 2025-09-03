import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário atual: R$");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Gênero[m/f]: ");
        String genero = scanner.next();

        System.out.print("Anos na empresa: ");
        int anosEmpresa = scanner.nextInt();

        double valorReajuste;

        if (genero.equals("f")) {

            if (anosEmpresa <= 15) {

                valorReajuste =  salarioAtual * 0.05f;

            } else if (anosEmpresa <= 20) {

                valorReajuste =  salarioAtual * 0.12f;

            } else {

                valorReajuste =  salarioAtual * 0.23f;

            }

        } else {

            if (anosEmpresa <= 20) {

                valorReajuste =  salarioAtual * 0.03f;

            } else if (anosEmpresa <= 30) {

                valorReajuste =  salarioAtual * 0.13f;

            } else {

                valorReajuste =  salarioAtual * 0.25f;

            }

        }

        double salarioReajustado =  salarioAtual + valorReajuste;

        System.out.printf("Salário Reajustado: R$%.2f", salarioReajustado);

        scanner.close();

    }

}
