import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String primeiroNome = leitor.nextLine();

        System.out.println("Digite o sobrenome: ");
        String sobreNome = leitor.nextLine();

        Random geradorAleatorio = new Random();
        int codigo = geradorAleatorio.nextInt(10, 100);



        System.out.println(primeiroNome + sobreNome + codigo);

    }
}