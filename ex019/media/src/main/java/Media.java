import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeDoAluno = scanner.nextLine();

        System.out.print("Primeira nota: ");
        float primeiraNota = scanner.nextFloat();

        System.out.print("Segunda nota: ");
        float segundaNota = scanner.nextFloat();

        float media = (primeiraNota + segundaNota) / 2;
        System.out.printf("O Aluno: %s , teve uma média %.1f", nomeDoAluno, media);

        if (media >= 7){

            System.out.println("Você teve um bom aproveitamento");

        } else {

            System.out.println("Você teve um péssimo aproveitamento");

        }

    }

}
