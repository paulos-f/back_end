import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Que ambientação você prefere?");
        System.out.println("1. Sci-fi");
        System.out.println("2. Medieval");
        int resposta1 = leitor.nextInt();

        if (resposta1 != 1 && resposta1 != 2) {
            System.out.println("Resposta inválida. Encerrando o programa.");
            leitor.close();
            return;
        }

        System.out.println("Que gênero você prefere?");
        System.out.println("1. Comédia");
        System.out.println("2. Drama");
        int resposta2 = leitor.nextInt();

        if (resposta2 != 1 && resposta2 != 2) {
            System.out.println("Resposta inválida. Encerrando o programa.");
            leitor.close();
            return;
        }



        if (resposta1 == 1 && resposta2 == 1) {
            System.out.println("Recomendação: Homens de Preto");
        } else if (resposta1 == 1 && resposta2 == 2) {
            System.out.println("Recomendação: Arrival");
        } else if (resposta1 == 2 && resposta2 == 1) {
            System.out.println("Recomendação: Shrek");
        } else if (resposta1 == 2 && resposta2 == 2) {
            System.out.println("Recomendação: Gladiador");
        }

    }
}
