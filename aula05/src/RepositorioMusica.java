import java.util.ArrayList;

public class RepositorioMusica {
    ArrayList<Musica> listaMusica = new ArrayList<>();

    public void adicionarMusica(String titulo, String artista) {
        Musica musica = new Musica(titulo, artista);
        listaMusica.add(musica);
    }

    public Musica buscarMusica(String termo){
        for (Musica item : listaMusica){
            if(item.getTitulo().equals(termo)) return item;
        }
        throw new RuntimeException("A musica n tem rapá");
    }
}
