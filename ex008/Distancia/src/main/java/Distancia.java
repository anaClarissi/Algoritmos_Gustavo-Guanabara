import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        float metros = scanner.nextFloat();

        System.out.printf("A distância de %.2fm corresponde a: \n", metros);

        float km = metros / 1000;
        float hm = metros / 100;
        float dam = metros / 10;
        float dm = metros * 10;
        float cm = metros * 100;
        float mm = metros * 1000;

        System.out.printf("%.2fKm\n%.2fHm\n%.2fDam\n%.2fDm\n%.2fCm\n%.2fMm", km, hm, dam, dm, cm,mm);

    }

}
