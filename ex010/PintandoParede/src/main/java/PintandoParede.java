import java.util.Scanner;

public class PintandoParede {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da parede em metros: ");
        float larguraDaParede = scanner.nextFloat();

        System.out.print("Digite a largura da parede em metros: ");
        float alturaDaParede = scanner.nextFloat();

        float areaParaPintar = (alturaDaParede * larguraDaParede) * 2;
        float quantidadeDeTinta = areaParaPintar / 2;

        System.out.printf("Área a ser pintada: %.2fm\nQuantidade de tinta: %.2fL", areaParaPintar, quantidadeDeTinta);

    }

}
