import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Segmento A: ");
        int segmentoA = scanner.nextInt();

        System.out.print("Segmento B: ");
        int segmentoB = scanner.nextInt();

        System.out.print("Segmento C: ");
        int segmentoC = scanner.nextInt();

        if (segmentoA + segmentoB > segmentoC && segmentoA + segmentoC > segmentoB && segmentoB + segmentoC > segmentoA) {

            if (segmentoA == segmentoB && segmentoB == segmentoC) {

                System.out.println("Triangulo EQUILÁTERO!");

            } else if (segmentoA != segmentoB && segmentoB != segmentoC && segmentoA != segmentoC) {

                System.out.println("Triangulo ESCALENO");

            } else {

                System.out.println("Triangulo ISOSCELES");

            }

        } else {

            System.out.println("Não é possível formar um Triângulo!");

        }


    }

}
