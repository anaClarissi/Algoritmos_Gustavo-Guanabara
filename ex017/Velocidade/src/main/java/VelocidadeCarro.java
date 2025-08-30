import java.util.Scanner;

public class VelocidadeCarro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Velocidade atual do carro (Km): ");
        float velocidadeDoCarro = scanner.nextFloat();

        float valorDaMulta;

        if (velocidadeDoCarro > 80){

            valorDaMulta = velocidadeDoCarro * 5;

            System.out.printf("Você foi multado em R$%.2f\n", valorDaMulta);

        }

        System.out.println("Dirija com segurança!");

    }

}
