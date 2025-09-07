import java.util.Scanner;
import java.util.Random;

public class VetorComNumeroSorteado {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		Random random = new Random();

		int numeroSorteado;

		int[] listaNumeros = new int[30];

		int vezesSorteado = 0;

		for (int posicao = 0; posicao < listaNumeros.length; posicao++){
	
			numeroSorteado = random.nextInt(15) + 1;			

			listaNumeros[posicao] = numeroSorteado;	

		}

		for (int numero : listaNumeros){

			System.out.printf("%d \n", numero);

		}
	
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		System.out.printf("O número %d foi encontrado na posição: ", numero);
	
		for (int posicao = 0; posicao < listaNumeros.length; posicao++){

			if (numero == listaNumeros[posicao]){
				
				vezesSorteado++;				

				System.out.printf("%d ", posicao);

			}			

		}

		System.out.printf("\nVezes Sorteado: %d", vezesSorteado);		
		

	}	    

}
