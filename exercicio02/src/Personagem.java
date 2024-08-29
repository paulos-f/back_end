// Personagem.java
public class Personagem {
    String nome;
    int vida;
    int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        }
    }

    public void atacar(Personagem alvo) {
        if (this.vida == 0) {
            System.out.println(this.nome + " não pode atacar porque está derrotado.");
            return;
        }
        if (alvo.vida == 0) {
            System.out.println(this.nome + " não pode atacar " + alvo.nome + " porque ele já foi derrotado.");
            return;
        }
        System.out.println(this.nome + " atacou " + alvo.nome + " causando " + this.ataque + " de dano.");
        alvo.receberDano(this.ataque);
    }
}
