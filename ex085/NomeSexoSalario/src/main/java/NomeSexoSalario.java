import java.util.Scanner;

public class NomeSexoSalario {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		String[] listaNomes = new String[5];	
		String[] listaSexos = new String[5];
		double[] listaSalarios = new double[5];

		for (int index = 0; index < listaNomes.length; index++){

			System.out.printf("%dºNome: ", index + 1);
			listaNomes[index] = scanner.nextLine();
		
			System.out.printf("%dºSexos[m/f]: ", index + 1);
			listaSexos[index] = scanner.nextLine();

			System.out.printf("%dºSalário: R$", index + 1);
			listaSalarios[index] = scanner.nextDouble();

			scanner.nextLine();

		}

		for (int index = 0; index < listaNomes.length; index++){

			if (listaSexos[index].equals("f") && listaSalarios[index] >= 5000){
				
				System.out.println("---------------");
				System.out.printf("Nome: %s\nSexo: %s\nSalário: R$%.2f\n", listaNomes[index], listaSexos[index], listaSalarios[index]);
				System.out.println("---------------");

			}

		}

		scanner.close();
		
	}

}
