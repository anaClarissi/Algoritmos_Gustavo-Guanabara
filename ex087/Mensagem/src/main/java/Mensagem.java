import java.util.Scanner;

public class Mensagem {

	public static void gerador(String mensagem){

		System.out.println("+-----===========-----+");
		System.out.println(mensagem);
		System.out.println("+-----===========-----+");

	}

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma mensagem: ");
		String mensagem = scanner.nextLine();

		gerador(mensagem);

	}

}
