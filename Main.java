import adapters.ParticipanteRepositorioCSV;
import application.GeradorSorteio;

public class Main {
    public static void main(String[] args) {
        var repositorio = new ParticipanteRepositorioCSV();
        var geradorSorteio = new GeradorSorteio(150, repositorio);

        var ganhadores = geradorSorteio.sortea(2);

        ganhadores.forEach(System.out::println);
    }
}
