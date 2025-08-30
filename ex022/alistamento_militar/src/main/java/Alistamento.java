import java.time.Year;
import java.util.Scanner;

public class Alistamento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome de nascimento: ");
        int anosDeNascimento = scanner.nextInt();

        System.out.println(alistamentoMilitar(anosDeNascimento));

    }


    public static String alistamentoMilitar(int anoDeNascimento){

        Year anoAtual = Year.now();

        int idadeDoUsuario = anoAtual.getValue() - anoDeNascimento;

        if (idadeDoUsuario <= 18){

            return String.format("Faltam %d anos para você se alistar!", 18 - idadeDoUsuario);

        } else {

            return String.format("Ja se passaram %d anos desde o alistamento", idadeDoUsuario - 18);

        }

    }

}
