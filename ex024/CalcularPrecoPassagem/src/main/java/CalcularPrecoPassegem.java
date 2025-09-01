import java.util.Scanner;

public class CalcularPrecoPassegem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância: Km");
        float distancia = scanner.nextFloat();

        float valorPagar;

        if (distancia <= 200) {

            valorPagar = distancia * 0.50f;

        } else {

            valorPagar = distancia * 0.45f;

        }

        System.out.printf("Você deverá pagar: R$%.2f", valorPagar);

    }

}
