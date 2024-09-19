import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar o cinema e adicionar filmes disponíveis
        Cinema cinema = new Cinema();
        cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 12));
        cinema.adicionarFilme(new Filme("Velozes e Furiosos", 25.0, 14));
        cinema.adicionarFilme(new Filme("Toy Story", 15.0, 0));
        cinema.adicionarFilme(new Filme("Pânico", 18.0, 16));
        cinema.adicionarFilme(new Filme("Harry Potter", 22.0, 10));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Solicitar dados do cliente
                System.out.println("Qual o seu nome?");
                String nomeCliente = scanner.nextLine();

                System.out.println("Qual a sua idade?");
                int idadeCliente = scanner.nextInt();
                scanner.nextLine();  // Consumir nova linha

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                // Solicitar o filme desejado
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = scanner.nextLine();

                Filme filmeEscolhido = null;
                for (Filme filme : cinema.getFilmesDisponiveis()) {
                    if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                        filmeEscolhido = filme;
                        break;
                    }
                }

                if (filmeEscolhido == null) {
                    System.out.println("Filme não encontrado.");
                    continue;
                }

                // Solicitar o assento desejado
                System.out.println("Qual assento você deseja?");
                String assento = scanner.nextLine();

                // Criar e vender o ingresso
                Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);
                cinema.venderIngresso(ingresso);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Perguntar se deseja repetir
            System.out.println("Deseja realizar outra venda? (sim/não)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("sim")) {
                break;
            }
        }

        scanner.close();
    }
}
