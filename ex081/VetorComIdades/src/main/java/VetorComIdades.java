import java.util.Scanner;

public class VetorComIdades {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int[] listaIdades = new int[8];

		int mediaIdades = 0;
		int maiorIdade = 0;
		
		for (int posicao = 0; posicao < listaIdades.length; posicao++){

			System.out.printf("%dº Idade: ", posicao + 1);
			listaIdades[posicao] = scanner.nextInt();
	
			scanner.nextLine();					
			
		}

		for (int idade : listaIdades){

			mediaIdades += idade;

		}
	
		mediaIdades /= listaIdades.length;

		System.out.printf("Média de Idades: %d\n", mediaIdades);			

		System.out.print("Posições com idades maiores que 25: ");

		for (int posicao = 0; posicao < listaIdades.length; posicao++){

			if (listaIdades[posicao] > 25){
		
				System.out.printf("%d ", posicao + 1);
	
			}

		}


		for (int idade : listaIdades){

			if (idade > maiorIdade){

				maiorIdade = idade;

			}

		}
		
		System.out.printf("\nMaior idade digitada: %d\n", maiorIdade);

		System.out.print("Posição da maior idade: ");

		for (int posicao = 0; posicao < listaIdades.length; posicao++){

			if (listaIdades[posicao] == maiorIdade){

				System.out.printf("%d ", posicao + 1);

			}

		}

		scanner.close();

	}

}
