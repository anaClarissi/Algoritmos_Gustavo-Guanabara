import java.util.Scanner;

public class Fumante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cigarros fumados por dia: ");
        int cigarrosFumadosPorDia = scanner.nextInt();

        System.out.print("Anos que você fuma: ");
        int anosFumados = scanner.nextInt();

        int diasPerdidos = (((cigarrosFumadosPorDia * anosFumados * 365) * 10) / 60) / 24;

        System.out.printf("Você perdeu %d dias de vida",diasPerdidos);


    }

}
