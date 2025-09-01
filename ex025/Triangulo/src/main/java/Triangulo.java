import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Segmento A: ");
        int segmentoA = scanner.nextInt();

        System.out.print("Segmento B: ");
        int segmentoB = scanner.nextInt();

        System.out.print("Segmento C: ");
        int segmentoC = scanner.nextInt();

        if (segmentoA + segmentoB > segmentoC && segmentoA + segmentoC > segmentoB && segmentoB + segmentoC > segmentoA) {

            System.out.println("É possível formar um Triângulo!");

        } else {

            System.out.println("Não é possível formar um Triângulo!");

        }


    }

}
