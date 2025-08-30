import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        float primeiraNota = scanner.nextFloat();

        System.out.print("Segunda nota: ");
        float segundaNota = scanner.nextFloat();

        float media = (primeiraNota + segundaNota) / 2;

        System.out.printf("A média entre %.1f e %.1f é igual a %.1f", primeiraNota, segundaNota, media);

    }

}
