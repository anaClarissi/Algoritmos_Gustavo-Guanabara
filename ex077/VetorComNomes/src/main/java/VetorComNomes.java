import java.util.Scanner;

public class VetorComNomes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	String[] listaNomes = new String[7];
	
	for (int posicao = 0; posicao < listaNomes.length; posicao++) {
		
		System.out.print("Digite um nome: ");
		listaNomes[posicao] = scanner.nextLine();	

	}

	for (int posicao = listaNomes.length - 1; posicao >= 0; posicao--) {
	
		System.out.printf("%s\n", listaNomes[posicao]);	

	}

    }

}
