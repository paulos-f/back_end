import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioMusica emule = new RepositorioMusica();

        emule.adicionarMusica("tete", "tttt");
        emule.adicionarMusica("bababa", "bbbb");
        emule.adicionarMusica("fefefe", "ffff");
        emule.adicionarMusica("rororo", "rrrrr");
        emule.adicionarMusica("nononono", "nnnnnnn");

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome da musica");
        String termo = scanner.nextLine();

        try {
            Musica musicaPesquisada = emule.buscarMusica(termo);
            System.out.println(musicaPesquisada.getTitulo() + "-" + musicaPesquisada.getArtista());
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
        }
    }
