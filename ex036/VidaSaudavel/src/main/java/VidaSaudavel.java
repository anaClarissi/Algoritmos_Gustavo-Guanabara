import java.util.Scanner;

public class VidaSaudavel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Horas de atividade por mês: ");
        int horasAtividadePorMes = scanner.nextInt();

        int pontos;

        if (horasAtividadePorMes <= 10) {

            pontos = horasAtividadePorMes * 2;

        } else if (horasAtividadePorMes <= 20) {

            pontos = horasAtividadePorMes * 5;

        } else {


            pontos = horasAtividadePorMes * 10;
        }

        double fatura = pontos * 0.05;

        System.out.printf("Pontos: %d\nFatura: R$%.2f", pontos, fatura);

        scanner.close();

    }

}
