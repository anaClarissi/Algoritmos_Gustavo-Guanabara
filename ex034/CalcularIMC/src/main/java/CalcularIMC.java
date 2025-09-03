import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Peso: ");
        float peso = scanner.nextFloat();

        System.out.print("Altura: ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        String status;

        if (imc >= 40) {

            status = "Obesidade Mórbida";

        } else if (imc >= 30) {

            status = "Obesidade";

        } else if (imc >= 25) {

            status = "Sobrepeso";
            
        } else if (imc >= 18.5) {

            status = "Peso Ideal";
            
        } else {

            status = "Abaixo do Peso";

        }

        System.out.printf("%s, seu estado é: %s", nome, status);

    }

}
