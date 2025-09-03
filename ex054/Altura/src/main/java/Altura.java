import java.util.Scanner;

public class Altura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float peso;
        int pesoMiorQue90 = 0;

        int pesoMenorQue50MedemMenosDe160 = 0;
        int pesoMaiorQue100MedemMaisDe190 = 0;

        float altura;
        float somaAltura = 0;
        float mediaAltura;

        int contador = 1;

        while (contador <= 7) {

            System.out.printf("Peso pessoa %d: ",contador);
            peso = scanner.nextFloat();

            System.out.printf("Altura pessoa %d: ", contador);
            altura = scanner.nextFloat();

            somaAltura += altura;

            if (peso > 90) {

                pesoMiorQue90++;

            }

            if (peso < 50 && altura < 1.60) {

                pesoMenorQue50MedemMenosDe160++;

            }

            if (peso > 100 && altura > 1.90) {

                pesoMaiorQue100MedemMaisDe190++;

            }

            contador++;

        }

        mediaAltura = somaAltura / 7;

        System.out.printf("\nMédia de altura: %.1f\nMais de 90kg: %d\nMenos que 50kg e menos que 1,60m: %d\nMaios de 100kg e mais de 1,90: %d", mediaAltura, pesoMiorQue90, pesoMenorQue50MedemMenosDe160, pesoMaiorQue100MedemMaisDe190);

        scanner.close();

    }

}
