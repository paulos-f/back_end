import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criação dos personagens inimigos
        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Orc", 100, 10));
        inimigos.add(new Personagem("Goblin", 50, 5));
        inimigos.add(new Personagem("Lobo", 75, 15));
        inimigos.add(new Personagem("Cavaleiro", 200, 20));
        inimigos.add(new Personagem("Dragão", 500, 50));

        // Criação do jogador
        Personagem jogador = new Personagem("Steve", 100, 20);

        Random random = new Random();

        // Loop do jogo
        while (jogador.vida > 0 && !inimigosDerrotados(inimigos)) {
            // Jogador ataca um inimigo aleatório
            Personagem inimigoAleatorio = inimigos.get(random.nextInt(inimigos.size()));
            jogador.atacar(inimigoAleatorio);

            // Inimigos atacam o jogador
            for (Personagem inimigo : inimigos) {
                if (inimigo.vida > 0) {
                    inimigo.atacar(jogador);
                }
            }
        }

        // Resultado final
        if (jogador.vida > 0) {
            System.out.println("Steve venceu!");
        } else {
            System.out.println("Steve foi derrotado!");
        }
    }

    public static boolean inimigosDerrotados(List<Personagem> inimigos) {
        for (Personagem inimigo : inimigos) {
            if (inimigo.vida > 0) {
                return false;
            }
        }
        return true;
    }
}
