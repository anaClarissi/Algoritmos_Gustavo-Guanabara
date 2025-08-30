import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idadeDoUsuario = scanner.nextInt();

        String poderDeVoto;

        if (idadeDoUsuario >= 18){

            poderDeVoto = "pode votar";

        }
        else  {

            poderDeVoto = "não pode votar";

        }

        System.out.printf("Você %s", poderDeVoto);

    }

}
