import java.util.Scanner;

public class EscolherBordaDaMensagem {

	public static void gerador(String mensagem, int quantidade, int borda){

		String tipoBorda;

		if (borda == 2){

			tipoBorda = "~~~~~~~~:::::::~~~~~~~~";

		} else if (borda == 3) {

			tipoBorda = "<<<<<<<<------->>>>>>>>";

		} else {

			tipoBorda = "+-------=======--------";

		}

		System.out.println(tipoBorda);
		for (int i = 1; i <= quantidade; i++){

			System.out.println(mensagem);

		}
		System.out.println(tipoBorda);

	}

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma mensagem: ");
		String mensagem = scanner.nextLine();

		System.out.print("Quantidade de mensagens: ");
		int quantidade = scanner.nextInt();
		
		scanner.nextLine();

		System.out.println("Escolha uma das bordas: ");

		System.out.println("1 - +-------=======-------+");
		System.out.println("2 - ~~~~~~~~:::::::~~~~~~~~");
		System.out.println("3 - <<<<<<<<------->>>>>>>>");

		System.out.print("Sua escolha: ");
		int escolha = scanner.nextInt();

		gerador(mensagem, quantidade, escolha);
		
		scanner.close();

	}

}
