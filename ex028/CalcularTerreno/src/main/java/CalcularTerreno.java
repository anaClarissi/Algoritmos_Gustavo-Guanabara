import java.util.Scanner;

public class CalcularTerreno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Largura: ");
        float largura = scanner.nextFloat();

        System.out.print("Altura: ");
        float altura = scanner.nextFloat();

        float area = largura * altura;

        System.out.printf("Este terrno tem %.2fm²\n", area);

        if (area < 100) {

            System.out.println("TERRENO POPULAR!");

        } else if (area > 500) {

            System.out.println("TERRENO VIP");

        } else {

            System.out.println("TERRENO MASTER!");

        }

    }

}
