public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "Paulo";
        jogador.vida = 23;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Capeta";
        inimigo.vida = 1000;

        jogador.atacar(inimigo);

        System.out.println("paulo: " + jogador.vida);
        System.out.println("lula: " + inimigo.vida);

    }
}
