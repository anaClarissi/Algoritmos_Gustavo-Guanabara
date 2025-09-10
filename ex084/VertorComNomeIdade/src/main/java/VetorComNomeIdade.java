import java.util.Scanner;

public class VetorComNomeIdade {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		String[] listaNomes = new String[9];
		int[] listaIdades = new int[9];
		
		for (int index = 0; index < listaNomes.length; index++){

			System.out.printf("%dºNome: ",index + 1);
			listaNomes[index] = scanner.nextLine();

			System.out.printf("%dªIdade: ",index + 1);
			listaIdades[index] = scanner.nextInt();
	
			scanner.nextLine();

		}

		for (int index = 0; index < listaIdades.length; index++){

			if (listaIdades[index] >= 18){
			
				System.out.printf("%s -> %d anos\n", listaNomes[index], listaIdades[index]);	

			}

		}

		scanner.close();	

	}

}
