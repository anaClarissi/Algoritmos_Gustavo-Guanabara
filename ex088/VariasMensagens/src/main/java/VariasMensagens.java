import java.util.Scanner;

public class VariasMensagens {

	public static void gerador(String mensagem, int quantidade){
	
		System.out.println("+-----===========-----+");
		for (int i = 1; i <= quantidade; i++){
		
			System.out.println(mensagem);

		}
		System.out.println("+-----===========-----+");

	}

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma mensagem: ");
		String mensagem = scanner.nextLine();

		System.out.print("Digite a quantidade de mensagens: ");
		int quantidade = scanner.nextInt();

		scanner.nextLine();

		gerador(mensagem, quantidade);

		scanner.close();

	}	

}
