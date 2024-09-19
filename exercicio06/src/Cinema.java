import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;
    private List<String> assentosDisponiveis;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        assentosDisponiveis = new ArrayList<>();
        // Assentos de A1 a F5
        for (char fila = 'A'; fila <= 'F'; fila++) {
            for (int num = 1; num <= 5; num++) {
                assentosDisponiveis.add(fila + Integer.toString(num));
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public boolean verificarAssentoDisponivel(String assento) {
        return assentosDisponiveis.contains(assento);
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        Filme filme = ingresso.getFilme();
        Cliente cliente = ingresso.getCliente();
        String assento = ingresso.getAssento();

        // Verifica a idade do cliente
        if (cliente.getIdade() < filme.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        // Verifica se o assento está disponível
        if (!verificarAssentoDisponivel(assento)) {
            throw new Exception("O ingresso não pode ser vendido pois o assento não está mais disponível!");
        }

        // Remove o assento da lista de disponíveis e adiciona o ingresso à lista de vendidos
        assentosDisponiveis.remove(assento);
        ingressosVendidos.add(ingresso);

        System.out.println("Ingresso vendido com sucesso! " + filme.getNome() + " - " + assento + " - " + cliente.getNome());
    }
}
