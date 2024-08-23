public class Personagem {
    public String nome;
    public int vida;

    public void atacar(Personagem alvo){
        System.out.println(alvo.nome + " foi atacado por " + this.nome);
        alvo.vida -= 5;
    }
}
