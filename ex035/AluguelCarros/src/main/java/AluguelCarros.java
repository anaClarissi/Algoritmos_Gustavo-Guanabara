import java.util.Scanner;

public class AluguelCarros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1 - Popular\n2 - Luxo\nQual o tipo do seu carro? ");
        int tipoCarro = scanner.nextInt();

        System.out.print("Quantos dias de aluguel? ");
        int diasAluguel = scanner.nextInt();

        System.out.print("Quantos Km pecorridos? ");
        float kmPecorridos = scanner.nextFloat();

        float aluguel;

        if (tipoCarro == 1) {

            if (kmPecorridos <= 100) {

                aluguel = 90 * diasAluguel + kmPecorridos * 0.2f;

            } else {

                aluguel = 90 * diasAluguel + kmPecorridos * 0.1f;

            }

        } else {

            if (kmPecorridos <= 200) {

                aluguel = 150 * diasAluguel + kmPecorridos * 0.3f;

            } else {

                aluguel = 150 * diasAluguel + kmPecorridos * 0.25f;

            }

        }

        System.out.printf("Valor do aluguel: %.2f", aluguel);

    }

}
