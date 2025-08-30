import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int anoDigitado = scanner.nextInt();

        if (anoBissexto(anoDigitado)){
            System.out.printf("O ano %d é Bissexto", anoDigitado);
        } else {
            System.out.printf("O ano %d Não é bissexto", anoDigitado);
        }

    }

    public static boolean anoBissexto( int ano){

        if (ano % 4 == 0){

            if (ano % 100 == 0){
                return ano % 400 == 0;
            }
            else {
                return true;
            }

        }
        else {
            return false;
        }

    }

}
