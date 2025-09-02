import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.print("1 - Pedra\n2 - Papel\n3 - Tesoura\nEscolha: ");
        int escolhaUsuario = scanner.nextInt();

        int escolhaComputador = random.nextInt(3) + 1;

        if (escolhaUsuario == escolhaComputador){

            System.out.println("Empate!");

        } else if (escolhaUsuario == 1) {

            if (escolhaComputador == 2){

                System.out.println("Pedra x Papel");
                System.out.println("Você Perdeu!");

            } else {

                System.out.println("Pedra x Tesoura");
                System.out.println("Você Ganhou!");

            }

        } else if (escolhaUsuario == 2) {

            if (escolhaComputador == 3) {

                System.out.println("Papel x Tesoura");
                System.out.println("Você Perdeu!");

            } else {

                System.out.println("Papel x Pedra");
                System.out.println("Você Ganhou!");

            }

        } else {

            if (escolhaComputador == 1) {

                System.out.println("Tesoura x Pedra");
                System.out.println("Você Perdeu!");

            } else {

                System.out.println("Tesoura x Papel");
                System.out.println("Você Ganhou!");

            }

        }

    }

}
