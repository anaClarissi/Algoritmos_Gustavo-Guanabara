import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.1f",media);

        if (media <= 4.5f) {

            System.out.println("REPROVADO!");
            
        } else if (media >= 7) {

            System.out.println("APROVADO!");
            
        } else {

            System.out.println("RECUPERAÇÃO!");

        }

    }

}
